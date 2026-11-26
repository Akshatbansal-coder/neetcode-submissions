class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode a=new ListNode();
        ListNode b=new ListNode();
        ListNode c=null;
        ListNode curr=new ListNode();
        int count=1;


        curr=head;
        while(count<left){
            // b is the last element to be joined to middle chain
            b=curr;
            curr=curr.next;
            count++;
        }
        ListNode z=new ListNode();
        z=curr;
        while(count<=right){
        

            // c is first element of middle chain
            a=curr.next;
            curr.next=c;
            c=curr;
            curr=a;

            count++;

        }
        if(left!=1){
        b.next=c;
        }
        else{
            head=c;
        }
        z.next=a;
        

        // a is the first element of last chain;
        return head;
        }

    }
