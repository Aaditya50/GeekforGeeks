/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		/*package whatever //do not write package name here */
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int j=0;j<t;j++){
    		int n = scn.nextInt();
    		int[] arr = new int[n];
    		
    		for(int i=0;i<n;i++){
    		    arr[i] = scn.nextInt();
    		}
    		int max = arr[0];
    		int min = arr[0];
    		
    		for(int i=1;i<n;i++){
    		   if(arr[i]>max){
    		       max = arr[i];
    		   }
    		}
    		for(int i=1;i<n;i++){
    		  if(arr[i]<min){
    		       min = arr[i];
    		   }
    		}
    		System.out.print(max+" "+min);
    		System.out.println();
		}

	}
}
