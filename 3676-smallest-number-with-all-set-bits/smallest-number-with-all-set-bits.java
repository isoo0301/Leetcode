class Solution {
    public int smallestNumber(int n) {
        String bi = Integer.toBinaryString(n);
        int len = bi.length();
        char[] s = new char[len];
        Arrays.fill(s,'1');
        String ss = new String(s);
        return Integer.parseInt(ss,2);
    }
}