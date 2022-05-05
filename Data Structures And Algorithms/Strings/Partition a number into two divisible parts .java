// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String str[] = read.readLine().split(" ");
            String S= str[0];
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            Solution ob = new Solution();
            System.out.println(ob.stringPartition(S,a,b));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static String stringPartition(String s, int a, int b){
        // code here
       String res="";
       String f1,f2;
       for(int i=0;i<s.length()-1;i++){
           f1=s.substring(0,i+1);
           f2=s.substring(i+1);
           if(Integer.parseInt(f1)%a==0&&Integer.parseInt(f2)%b==0){
               res+=f1;
               res+=" ";
               res+=f2;
               return res;
           }
       }
       return "-1";
    }
}
