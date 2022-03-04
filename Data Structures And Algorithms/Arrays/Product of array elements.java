class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        //yout code here
        long ans = 1;
        for(int i=0;i<n;i++){
            ans = (ans*arr[i])%mod; 
        }
        return ans;
    }
}
