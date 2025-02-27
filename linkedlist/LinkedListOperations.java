package linkedlist;

public class LinkedListOperations {
	public static void main(String args[]) {
		System.out.println("Intersection at node with value: " + findIntersection().data);
		int[] elements = {10, 7, 90};
		ListNode node = ListNode.createLinkedList(elements);
		System.out.println(node);
		while(node != null){
			System.out.println(node.data);
			node = node.next;
		}

		System.out.println("Detect: "+ detectCycle().data);
	}

	public static ListNode findIntersection() {
		ListNode intersection = new ListNode(8);
		intersection.next = new ListNode(4);
		intersection.next.next = new ListNode(5);

		ListNode headA = new ListNode(4);
		headA.next = new ListNode(1);
		headA.next.next = intersection;

		ListNode headB = new ListNode(5);
		headB.next = new ListNode(6);
		headB.next.next = new ListNode(1);
		headB.next.next.next = intersection;

		int lengthOfHeadA = getLinkedListLength(headA);
		int lengthOfHeadB = getLinkedListLength(headB);

		while(lengthOfHeadA > lengthOfHeadB){
			lengthOfHeadA--;
			headA = headA.next;
		}

		while(lengthOfHeadB > lengthOfHeadA){
			lengthOfHeadB--;
			headB = headB.next;
		}

		while(headA != headB){
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}

	private static int getLinkedListLength(ListNode head) {
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}
		return len;
	}

	public static ListNode detectCycle(){
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(10);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(6);
		ListNode node5 = new ListNode(7);
		ListNode node6 = new ListNode(8);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node4;


		ListNode slow = node1, fast = node1;

		// Advance both at different speeds
		// until they meet once
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

			// As soon as they meet, start from the
			// head again and move at the same speed
			if (slow == fast) {
				while (node1 != slow) {
					node1 = node1.next;
					slow = slow.next;
				}
				return slow;
			}
		}
		return null;
	}

	public static ListNode reverseLinkedList(ListNode head) {
		ListNode current = head;
		ListNode previous = null;
		while (current != null) {
			ListNode nextNode = current.next;
			current.next = previous;
			previous = current;
			current = nextNode;
		}
		head = previous;
		return head;
	}
}
