class Solution{
    public boolean isPalindrome(int x){
        if(x<0) return false;
        if(x<10) return true;
        int m = x;
        int t = 0;
        while(x!=0){
            t=(t*10)+(x%10);
            x/=10;
        }
        return t==m;
    }
}
      