class Solution{
    public int climbStairs(int n){
        int a = 1, b = 1;
        for(int i =2; i <= n; i++){
            int tmp=a;
            a=b;
            b=tmp+b;
        }
        return b;
    }
}   

// 0 1 2 3 4 5 6
// 1 1 2 3 5