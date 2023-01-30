class Solution {
    public int solution(int[] a, int[] b) {
        
        int i, j;
        int inner = 0;
        int insum = 0 ;
        
        for(i = 0; i < a.length ; i++){
            inner = a[i] * b[i];
            insum += inner;
            }
        return insum;
    }        
}