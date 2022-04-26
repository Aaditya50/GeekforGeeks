// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


class GFG
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int n;
        while(t-- > 0){
            n = sc.nextInt();
    
            Solution obj = new Solution();
            for(int i = 1; i <= n; i++)
            {
                int x =sc.nextInt();
                obj.insertHeap(x);
                System.out.println((int)Math.floor(obj.getMedian()));
            }
        }
        
        
    }
}

// } Driver Code Ends


class Solution
{   
    static PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> right = new PriorityQueue<>();
    //Function to insert heap.
    public static void insertHeap(int x)
    {
            left.add(x);
            right.add(left.remove());
            balanceHeaps();
    }
    
    public static void balanceHeaps()
    {       
      if(right.size()>left.size()){
           left.add(right.remove());
       }
    }
    
    public static double getMedian()
    {   
        if(left.size() == right.size() ){
            int i = left.peek();
            int j = right.peek();
            return (double)(i+j)/2;
        }
        return (double)left.peek();
    }

    
}
