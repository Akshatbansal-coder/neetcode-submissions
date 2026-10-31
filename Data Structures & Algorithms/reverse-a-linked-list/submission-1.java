class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null ){
            return null;
        }
        ListNode a=head;
        ListNode b=new ListNode();
        ListNode g=null;
       
       while(a!=null){
        
        b=a.next;
        a.next=g;
        g=a;
        a=b;
       

        }
        return g;
    }
}
