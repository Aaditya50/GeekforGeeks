class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum = 0 , res = 0 ;
        for(int i=0;i<n-1;i++){
            sum += array[i]; 
        }
        res = (n*(n+1))/2;
        return Math.abs(res-sum);
        
    }
}
