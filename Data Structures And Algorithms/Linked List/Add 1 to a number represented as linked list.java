//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node reverselist(Node node){
        if(node == null) return node;
        Node curr = node;
        Node dummy = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = dummy;
            dummy = curr;
            curr = temp;
        }
        return dummy;
        
    }
    
    public static Node addOne(Node head) 
    { 
        //code here.
        head= reverselist(head);
        Node temp=head;
        Node pre=null;
        int carry=1;
        while(temp!=null){
          int val=temp.data+carry;
          temp.data=val%10;
          carry=val/10;
          pre=temp;
          temp=temp.next;
        }
        if(carry!=0){
            pre.next=new Node(carry);

        }
        head= reverselist(head);
        return head;
    }
}
