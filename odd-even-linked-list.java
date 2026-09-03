/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode oddh=null;
        ListNode oddt=null;
        ListNode evenh=null;
       ListNode event=null;
        ListNode p=head;
        boolean isodd=true;
        while(p!=null)
        {
            if(isodd==true)
            {
                if(oddh==null)
                {
                    oddh=oddt=p;
                }
                else{
                    oddt.next=p;
                    oddt=p;
                }
                isodd=false;
            }
            else{
                if(evenh==null)
                {
                    evenh=event=p;
                }
                else{
                    event.next=p;
                    event=p;
                }
                isodd=true;
            }
            p=p.next;
        }
        if(evenh!=null)
        {
        oddt.next=evenh;
        event.next=null;
        }
        return oddh;
        
    }
}
