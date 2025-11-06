class Solution{
    public int mySqrt(int x){
        if(x<2)return x;
        int l = 0, r = x/2;
        while(l<=r){
            int m = l+(r-l)/2;
            long k = (long)m*m;
            if(k>x){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return r;
    }
}