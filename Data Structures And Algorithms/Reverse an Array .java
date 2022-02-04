/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int j=0;j<t;j++){
    		int n = scn.nextInt();
    		int[] arr = new int[n];
    		
    		for(int i=0;i<n;i++){
    		    arr[i] = scn.nextInt();
    		}
    		
    		int lo = 0;
    		int hi = n-1;
    		
    		while(lo<hi){
    		    int temp = arr[lo];
    		    arr[lo] = arr[hi];
    		    arr[hi] = temp;
    		    lo++;
    		    hi--;
    		}
    		
    		for(int i=0;i<arr.length;i++){
    		    System.out.print(arr[i]+" ");
    		}
    		System.out.println();
		}
	}
}
