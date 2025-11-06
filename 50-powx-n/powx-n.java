class Solution {
    public double myPow(double x, int n){
        return myPow2(x,(long)n);
    }
    public double myPow2(double x, long n){
        if(n==0) return 1.0;
        if(n<0) return 1/myPow2(x, -1*n);
        if(n%2==1) return x*myPow2(x*x, (n-1)/2);
        else return myPow2(x*x, n/2);
    }
}