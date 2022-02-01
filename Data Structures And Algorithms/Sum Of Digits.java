class Solution{
    static int sumOfDigits(int N) {
        // code here
        int sum = 0;
        while(N != 0){
            int rem = N % 10;
            N = N/10;
            sum += rem;
        }
        return sum;
    }
}
