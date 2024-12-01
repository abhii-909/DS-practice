// Here's the boilerplate code for any linked list program in Java. This includes the essential structure that you'll need in almost every linked list implementation, regardless of the specific logic.


package myLinkedList;
// Definition of a Node in the linked list
class Node {
    int data; // Stores the value of the node
    Node next; // Reference to the next node

    // Constructor to initialize a new node
    Node(int x) {
        data = x; // Assign the value to the node
        next = null; // By default, the next reference is null
    }
}

// Utility class for Linked List operations
class LinkedList {
    Node head; // Reference to the head (start) of the linked list

    // Method to print the linked list
    void printList() {
        Node current = head; // Start from the head
        while (current != null) { // Traverse until the end
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // Indicate the end of the list
    }

    // Method to add a new node at the end of the list
    void insertAtEnd(int x) {
        Node newNode = new Node(x); // Create a new node
        if (head == null) { // If the list is empty
            head = newNode; // The new node becomes the head
            return;
        }
        Node current = head; // Start from the head
        while (current.next != null) { // Traverse to the last node
            current = current.next;
        }
        current.next = newNode; // Link the last node to the new node
    }
}

// Driver class for testing the linked list
public class BoilerPlate {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new linked list

        // Add some elements to the linked list
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        // Print the linked list
        list.printList(); // Output: 1 -> 2 -> 3 -> null
    }
}
