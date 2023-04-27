package com.java;

public class LinkedList9 {
	    Node head;
	    
	    public LinkedList9() {
	        this.head = null;
	    }
	    
	  //method to insert element in linked list
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
	    // method to delete a node with a given value
	    public void delete(int value) {
	        if (head == null) {
	            return;
	        }
	        if (head.data == value) {
	            head = head.next;
	            return;
	        }
	        Node prev = head;
	        Node current = head.next;
	        while (current != null) {
	            if (current.data == value) {
	                prev.next = current.next;
	                return;
	            }
	            prev = current;
	            current = current.next;
	        }
	    }
	    
	    // method to get the size of the linked list
	    public int size() {
	        int count = 0;
	        Node current = head;
	        while (current != null) {
	            count++;
	            current = current.next;
	        }
	        return count;
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

