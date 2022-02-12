class Solution
{
    long minValueToBalance(long arr[] ,int n)
    {
        int suml=0,sumr=0;
        for(int i=0;i<n/2;i++){
            suml += arr[i];
        }
        
        for(int i=n/2;i<n;i++){
            sumr += arr[i];
        }
        return Math.abs(suml-sumr);

    }
}
