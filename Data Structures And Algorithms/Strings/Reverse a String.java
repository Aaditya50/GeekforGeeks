// { Driver Code Starts
// Initial template for Java

import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.revStr(S));
        }
    }
}// } Driver Code Ends


class Solution {
    static String revStr(String S) {
        // code here
        char[] s = S.toCharArray();
        int l = 0;
        int r = s.length-1;
        while(l<=r){
            char m = s[l];
            s[l] = s[r];
            s[r] = m;
            l++;r--;
        }
        return String.valueOf(s);
    }
}
