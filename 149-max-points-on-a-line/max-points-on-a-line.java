class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if(n==1) return 1;
        int max=0;
        for(int i = 0; i < n; i++){
            Map<Double, Integer> map = new HashMap<>();
            for(int j=i+1; j<n; j++){
                double slope = getSlope(points[i], points[j]);
                map.put(slope, map.getOrDefault(slope, 0)+1);
                max = Math.max(max, map.get(slope));
            }
        }
        return max+1;
    }

    private double getSlope(int[] a, int[] b){
        int x1=a[0], y1=a[1];
        int x2=b[0], y2=b[1];
        if(x1==x2) return Double.MAX_VALUE;
        if(y1==y2) return 0;
        return (double)(y2-y1)/(double) (x2-x1);
    }
}