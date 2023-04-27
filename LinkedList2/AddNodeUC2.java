package com.java;

public class AddNodeUC2 {

	public static void main(String[] args) {
		  // Create the first node
        Node head = new Node(56);
        
        // Add the second node
        Node node1 = new Node(30);
        head.next = node1;
        
        // Add the third node
        Node node2 = new Node(70);
        node1.next = node2;
        
        // Print the values in the linked list
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }


	}

