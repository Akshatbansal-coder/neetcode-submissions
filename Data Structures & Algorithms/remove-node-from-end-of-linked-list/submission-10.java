class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode ans =head;
    int i=0;
    int x=0;
    while(ans!=null){
        i++;
        ans=ans.next;
    }

    if(n==i){
        return head.next;
    }
  ans =head;
    while(x<i-n-1){
        x++;
        ans=ans.next;

    }

    ans.next=ans.next.next;

    return head;
    }
}
