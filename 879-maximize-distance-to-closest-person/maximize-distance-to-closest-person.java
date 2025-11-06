class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        List<Integer> lst = new ArrayList<>();
        if(seats[0]==0) lst.add(-1);
        for(int i = 0; i < n; i++){
            if(seats[i]==1) lst.add(i);
        }
        if(seats[n-1]==0) lst.add(n);
        
        int maxD = 0;

        for(int i = 1; i < lst.size(); i++){
            int gap = lst.get(i)-lst.get(i-1);
            if(lst.get(i-1)==-1 || lst.get(i)==n){
                maxD=Math.max(maxD, gap-1);
            }
            else{
                maxD= Math.max(gap/2, maxD);
            }
        }
        return maxD;
    }
}