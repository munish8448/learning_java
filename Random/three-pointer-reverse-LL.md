The "three pointer" method for reversing a linked list involves using three pointers, namely "prev", "current", and "next", to iterate through the list and re-link the nodes in reverse order.

Here's the basic idea:

Initialize the "prev" pointer to NULL and the "current" pointer to the head of the list
Iterate through the list by moving the "current" pointer to the next node and the "next" pointer to the node after that
In each iteration, re-link the "current" node's next pointer to point to the "prev" node
Finally, move "prev" pointer to "current" and "current" pointer to "next"
The list will be reversed when the current pointer reaches the end of the list.

It's a good idea to draw a diagram to help visualize the process.

```java
/**
 * Definition for linked list.
 * public class Node {
 *     int val;
 *     Node next;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, Node next) { this.val = val; this.next = next; }
 * }
 */

public static Node reverse(Node head){
        // three pointer reverse method for linked list

        Node curr = head, prev = null;
        while(curr != null){
            // save the next node address in nbr pointer
            Node nxt = curr.next;
            // connect the current node with previous node
            curr.next = prev;
            // move previous pointer forward
            prev = curr;
            // move current pointer forward
            curr = nxt;
        }

        return prev;
    }
    
```
