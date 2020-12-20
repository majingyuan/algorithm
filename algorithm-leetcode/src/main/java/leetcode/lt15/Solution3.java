package leetcode.lt15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {
    public List<List<Integer>> func(int[] arr){
        List<List<Integer>> result =  new ArrayList<>();

        Arrays.sort(arr);

        for(int k = 0;k<arr.length-2;k++){
            if(arr[k]>0){
                break;
            }
            if(k!=0 && arr[k] == arr[k -1]){
                continue;
            }
            int i=k+1,j=arr.length-1;

            while(i<j){

                int count = arr[k]+arr[i]+arr[j];

                if(count<0&&i<j){
                    while(arr[i] == arr[++i]);
                }else if(count > 0&& i<j){
                    while(arr[j] == arr[--j]);
                }else{
                  result.add(new ArrayList<>(Arrays.asList(arr[k],arr[i],arr[j])));
                  while(arr[i] == arr[++i]);
                  while(arr[j] == arr[--j]);
                }
            }
        }
        return result;
    }
}
