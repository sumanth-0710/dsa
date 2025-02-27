package linkedlist;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    public ListNode insertAtBeginning(ListNode head, int valToInsert) {

        // Create a node to insert
        ListNode newNode = new ListNode(valToInsert);

        // Assign the next of this node to head
        newNode.next = head;

        // Point the head of the list to this new node
        head = newNode;

        return head;
    }

    public ListNode insertAtEnd(ListNode head, int valToInsert) {

        // Create a node to insert
        ListNode newNode = new ListNode(valToInsert);

        // Goto the end of the list
        ListNode ptr = head;
        while (ptr.next != null)
            ptr = ptr.next;

        // Assign the newNode at the end of the list
        ptr.next = newNode;

        // Return original head
        return head;
    }

    public ListNode insertInMiddle(ListNode head, int valToInsert, int position) {

        // Create a node to insert
        ListNode newNode = new ListNode(valToInsert);

        // Move to the position
        ListNode ptr = head;
        for (int i = 0; i < position; i++) {
            ptr = ptr.next;
        }

        // Insert the node
        newNode.next = ptr.next;
        ptr.next = newNode;

        // Return original head
        return head;
    }

    public ListNode deleteFromBeginning(ListNode head) {

        // Just move the head to the next position
        head = head.next;

        // Return the new head
        return head;
    }

    public ListNode deleteAtEnd(ListNode head) {

        // Move to the second last node
        ListNode ptr = head;
        while (ptr.next.next != null)
            ptr = ptr.next;

        // Point the next of second last node to null
        ptr.next = null;

        // Return original head
        return head;
    }

    public ListNode deleteFromMiddle(ListNode head, int position) {

        // Move to previous position of node to delete
        ListNode ptr = head;
        for (int i = 0; i < position - 1; i++) {
            ptr = ptr.next;
        }

        // Get the node to delete
        ListNode nodeToDelete = ptr.next;

        // Get the address of node next to the node to be deleted
        ListNode nextNode = nodeToDelete.next;

        // Point the next of ptr to nextNode
        ptr.next = nextNode;

        // Return the original head
        return head;
    }

    public void traverseALinkedList(ListNode head) {

        ListNode temp = head;

        // Run a loop until you reach null
        while (temp != null) {

            // Print the first value
            System.out.println(temp.data);

            // Move to the next node
            temp = temp.next;
        }
    }
}
