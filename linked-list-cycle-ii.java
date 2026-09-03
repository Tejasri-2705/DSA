/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> hm=new HashMap<>();
        ListNode fp=head;
        int c=0;
        while(fp!=null)
        {
            if(hm.containsKey(fp))
            {
                int pos=hm.get(fp);
                return fp;
            }
            hm.put(fp,c++);
            fp=fp.next;
        }
        return null;
    }
}
