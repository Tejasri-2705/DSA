/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs=new HashSet<>();
        ListNode p=headA;
        while(p!=null)
        {
            hs.add(p);
            p=p.next;
        }
        ListNode q=headB;
        while(q!=null)
        {
            if(hs.contains(q))
            {
                return q;
            }
            q=q.next;
        }
        return null;
    }
}
