class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        if(head == null || k == 0) return head;
        Node pandu = head;
        while(pandu.next != null){
            pandu = pandu.next;
        }
        pandu.next = head;
        Node gandu = head;
        for(int i=0;i<k;i++){
            pandu = head;
            head = head.next;
        }
        pandu.next = null;
        return head;
    }
}
