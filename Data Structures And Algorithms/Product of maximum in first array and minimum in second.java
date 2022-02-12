class Solution{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        // Complete the Function
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        
        for(int i=0;i<m;i++){
            min = Math.min(min,brr[i]);
        }
        
        return max*min;
    }
    
    
}
