class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        int ind = -1;
        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                ind = i;
                break;
            }
            
        }
        return ind;
    }
}
