package leetcode.lc50;

public class Solution_error {
    public double myPow(double x, int n) {
        boolean f =  false;
        if( n == 1.0) return x;
        if( n== 0.0 ) return 1.0;
        if(n<0){
            n = n*-1;
            f =true;
        }
        return  f?1.0/subPow(x,n):subPow(x,n);
    }

    private double subPow(double x, int n) {
        if(n == 1 ){
            return x;
        }
        double mid = subPow(x,n / 2) * subPow(x,n / 2);

        return  n%2 == 0 ? mid : mid * x ;
    }
}
