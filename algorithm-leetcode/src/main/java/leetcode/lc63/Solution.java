package leetcode.lc63;

/**
 * 不同路线
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length,n =obstacleGrid[0].length;
        int[][] path = new int[m][n];


        if(obstacleGrid[m-1][n-1] == 1){
            return 0;
        }

        for(int i =0;i <m;i++){    //最右边那一列
            if(obstacleGrid[i][n-1] != 1)
                path[i][n-1] = 1;
        }
        for(int i =0;i<n;i++){
            if(obstacleGrid[m-1][i] != 1)
                path[m-1][i] = 1;
        }

        for(int i=m-2;i >= 0 ;i--){
            for(int j =n-2;j>=0;j--){
                if(obstacleGrid[i][j] !=1)
                    path[i][j] = path[i+1][j]+ path[i][j+1];
                else
                    obstacleGrid[i][j] = 0;
            }
        }

        return path[0][0];
    }
}
