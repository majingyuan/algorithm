package leetcode.lt69;

/**
 * 二分查找，求平方根
 */
public class Solution {
    //方法1：二分查找
    //y = x^2,(x>0):抛物线右侧单调递增：上界限是x，下限是1
    public int mySqrt(int x){
        if(x ==0 || x == 1)
            return x;

        long left =1, right =x;
        long mid =1;
        while(left <= right){
            mid = left + (right - left)/2;
            if(mid * mid > x){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return (int)right;
    }
}
