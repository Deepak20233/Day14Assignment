package com.java;

public class LinkedList4 {
	  Node head;
	    
	    public LinkedList4() {
	        this.head = null;
	    }
	    
	    // method to insert a new node at a specific index
	    public void insert(int data, int index) {
	        Node newNode = new Node(data);
	        
	        if (index == 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }
	        
	        Node current = head;
	        for (int i = 0; i < index - 1 && current != null; i++) {
	            current = current.next;
	        }
	        
	        if (current == null) {
	            return;
	        }
	        
	        newNode.next = current.next;
	        current.next = newNode;
	    }
	    
	    // method to print the linked list
	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	    }
}
