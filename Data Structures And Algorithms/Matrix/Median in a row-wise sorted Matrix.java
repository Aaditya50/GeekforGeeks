class Solution {
    int median(int matrix[][], int r, int c) {
        // code here 
        int m=0;
        int[] ans = new int[r*c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[m] = matrix[i][j];
                m++;
            }
        }
        
        Arrays.sort(ans);
        return ans[(ans.length/2)];
    }
}
