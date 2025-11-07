class Solution {
    public int earliestAcq(int[][] logs, int n) {
        Arrays.sort(logs, (a,b) -> a[0]-b[0]);
        int[] parent = new int[n];
        for(int i = 0; i < n; i++) parent[i]=i;
        int count=n;

        for(int[] log: logs){
            int t=log[0];
            int a=log[1];
            int b=log[2];
            int ra = find(parent,a);
            int rb = find(parent,b);
            if(ra != rb){
                parent[ra]=rb;
                count--;
                if(count==1) return t;
            }
        }
        return -1;
    }

    private int find(int[] parent, int x){
        if(parent[x] != x) parent[x] = find(parent,parent[x]);
        return parent[x];
    }
}