class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
        ArrayList<Integer> ans = new ArrayList<>();
        int max = 0;
        for(int i=0;i<n;i++){
            if(b[i] > max){
                max = b[i];
            }
        }
        
        int le = a.length;
        int ri = a[0].length;
        int dia = 0;
        for(int i=0;i<le;i++){
            for(int j = 0;j<ri;j++){
                if( j<n && i==j){
                    dia += a[i][j];
                }
            }
        }
        ans.add(dia);
        ans.add(max);
        return ans;
        
        
    }
}
