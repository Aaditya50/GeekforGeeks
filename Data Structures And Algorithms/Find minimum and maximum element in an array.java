class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for(int i = 0 ; i<a.length ; i++){
            
                max = Math.max(max,a[i]);
                min = Math.min(min,a[i]);
            
        }
        return new pair (min,max);
    }
}
