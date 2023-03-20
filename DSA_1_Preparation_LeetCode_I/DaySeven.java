package DSA_1_Preparation_LeetCode_I;

public class DaySeven {

    /*
     * i Just copy pasted solutions
     * im not doing my self these question
     * for learning purpose im copy pasted 
     * once completed my 14 days DSA PREPRATION 
     * i will revise all the question and do it myself
     * 
     * --- LinkedList is started  --> every method as a class, class name is solution.....
     */



    //141. Linked List Cycle
    // 1st solution

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

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }


    //21. Merge Two Sorted Lists
    // 2nd solution
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val >= list2.val) {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        } else {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
    }



    //203. Remove Linked List Elements
    // 3rd solution
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

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }




    public static void main(String[] args) {
        
    }
    
}
