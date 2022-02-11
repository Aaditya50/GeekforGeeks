class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int max = 0,v = 0;
       for(int i=0;i<n;i++){
           if(arr[i] > max){
               max = arr[i];
               v = i;
           }
       }
       return v;
    }
}
