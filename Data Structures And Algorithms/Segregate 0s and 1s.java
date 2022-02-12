class Solution {
    void segregate0and1(int[] arr, int n) {
  int zerocount =0;
       int onecount =0;
       for(int i =0;i<n;i++)
       {
           if(arr[i]==0)
               zerocount++;
           else
               onecount++;
       }
       int k =0;
       for(int i =0; i < zerocount; i++)
       {
           arr[i] = 0;
           k = i;
       }
       for(int j = k+1; j < n; j++)
       {
           arr[j] = 1;
       }
    }

}
