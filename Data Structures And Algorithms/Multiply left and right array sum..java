//User function Template for Java


class Complete{
    
   
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
        int suml=0,sumr=0;
        for(int i=0;i<n/2;i++){
            suml += arr[i];
        }
        
        for(int i=n/2;i<n;i++){
            sumr += arr[i];
        }
        return suml*sumr;
    }
    
    
}
