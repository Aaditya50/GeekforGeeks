// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            double a[] = new double[(int)(n)];
            double getAnswer[] = new double[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Double.parseDouble(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.nullPoints(n, a, getAnswer); 
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n-1;i++)
                output.append(String.format("%.2f", getAnswer[i])+" ");
                
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public double help(double l, double h , double magnets[] , int n){
        double mid=0;
        while(l<h){
            mid = (l+h)/2;
            double ans=0;
            for(int i=0;i<n;i++){
                ans +=1/(mid-magnets[i]);
            }
            if(Math.abs(ans)<0.0000001) return mid;
            else if(ans<0){
                h=mid;
            }else{
                l=mid;
            }
        }
        return mid;
    }
    
    public void nullPoints(int n, double magnets[], double getAnswer[])
    {
        // Your code goes here 
        for(int i=0;i<n-1;i++){
            getAnswer[i] = help(magnets[i],magnets[i+1],magnets,n);
        }
    }
}


