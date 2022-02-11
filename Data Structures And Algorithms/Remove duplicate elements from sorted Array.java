class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int k=1;
        for(int i=1;i<N;i++){
            if(A[i] != A[k-1]){
                A[k] = A[i];
                k++;
            }
        }
        return k;
    }
}
