package leetcode.lt11;

public class Solution1 {

    public int area(int[] arr){

        int maxArea = 0;

        for(int i = 0,j = arr.length -1; i<j;){

            int height = arr[i] < arr[j] ? arr[i++] : arr[j--];

            int area = (j - i + 1) * height;

            maxArea = Math.max(maxArea,area);
        }


        return maxArea;
    }

    public int maxArea(int[] height) {
        int max = 0;

        for(int i = 0,j = height.length -1; i < j ; ){
            int minheight = height[i] < height[j] ? height[i++] : height[j --];      //如果height[i]值大，则 j的向左移（j--），如果height[j]值大，则i向右移

            int area = (j - i + 1) * minheight;    //算出下面边的长度

            max = Math.max(max,area);  //比较一下之前算的最大值和本次计算的哪个大
        }

        return max;
    }
}
