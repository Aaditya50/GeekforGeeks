//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        // code here
        Stack<Integer> c = new Stack<>();
        Stack<String> result = new Stack<>();
        
        String res = "";
        int index = 0 ;
        
        while(index < s.length()){
            if(Character.isDigit(s.charAt(index))){
                int count=0;
                while(Character.isDigit(s.charAt(index))){
                    count = 10 * count + (s.charAt(index)-'0');
                    index++;
                }
                c.push(count);
            }else if(s.charAt(index) == '['){
                result.push(res);
                res = "";
                index++;
            }else if(s.charAt(index) == ']'){
                StringBuilder temp = new StringBuilder(result.pop());
                int count = c.pop();
                for(int i=0;i<count;i++){
                    temp.append(res);
                }
                res = temp.toString();
                index++;
            }else{
                res += s.charAt(index);
                index++;
            }
        }
        
        return res;
        
    }
}
