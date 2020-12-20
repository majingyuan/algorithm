package leetcode.lc50;

/**
 * 求x的n次方
 */
public class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;

        if(x == 0)
            return 0;

        if(n < 0)
            return 1/ x * myPow(1/x,-(n + 1));     //将x
        else{
            if (n % 2 != 0) {
                return x * myPow(x * x, n / 2);
            } else {
                return myPow(x * x, n / 2);
            }
        }

    }
    public double pow(double x, int n) {
        double temp = x;
        if (n == 0)
            return 1;

        temp = pow(x, n / 2);

        if (n % 2 == 0)
            return temp * temp;
        else {
            if (n > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }
}
