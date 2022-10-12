//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<n;i++){
            hm.put(x[i],b[i]);
        }
        int l=0;
        int csum=0;
        if(hm.containsKey(w.charAt(l))) csum = hm.get(w.charAt(l));
        else csum = (int)w.charAt(l);
        int gsum = Integer.MIN_VALUE;
        int left=0,right=0;
        for(int i=1;i<w.length();i++){
            if(csum>gsum){
                gsum=csum;
                left=l;
                right=i-1;
            }
            if(csum<0){
                csum=0;
                l=i;
            }
            int svalue=0;
            if(hm.containsKey(w.charAt(i))) svalue = hm.get(w.charAt(i));
            else svalue = (int)w.charAt(i);
            csum += svalue;
        }
        if(csum>gsum){
            gsum=csum;
            left=l;
            right=w.length()-1;
        }
        return w.substring(left,right+1);
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends
