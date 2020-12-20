package leetcode.lt15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public List<List<Integer>> func(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for(int k = 0; k < arr.length -2; k++){
            if(arr[k] > 0){
                break;
            }

            //如果nums[k] = nums[k-1],说明是重复元数，直接continue
            if(k>0&& arr[k] == arr[k - 1]){
                continue;
            }

            int i = k + 1 , j = arr.length -1;

            while(i < j){
                int sum  =arr[k]  + arr[i] +arr[j];
                if(sum < 0){

                    while(arr[i] == arr[++i]&& i < j);       //如何i的右边和i想到，接着累加

                }else if(sum > 0){
                    while(arr[j] == arr[--j] && i < j);
                }else{
                    res.add(new ArrayList<Integer>(Arrays.asList(arr[k], arr[i],arr[j])));
                    while(i < j && arr[i] == arr[++i]);
                    while(i < j && arr[j] == arr[--j]);

                }

            }

        }


        return res;
    }

    public static void main(String args[]){
        new Solution1().func(new int[]{-1,-1,-2,0,5,3,-5});
    }
}
