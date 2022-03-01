class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        // your code here
        int le = mat.length;
        int ri = mat[0].length;
        for(int i=0;i<le;i++){
            for(int j=0;j<ri;j++){
                if(mat[i][j] == X){
                    return 1;
                }
            }
        }
        return 0;
    }
}
