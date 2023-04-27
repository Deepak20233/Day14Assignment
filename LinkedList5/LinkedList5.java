package com.java;

public class LinkedList5 {
	 Node head;
	    
	    public LinkedList5() {
	        this.head = null;
	    }
	    
	    // method to delete the first node in the list
	    public void deleteFirst() {
	        if (head == null) {
	            return;
	        }
	        
	        head = head.next;
	    }
	    
	    // method to print the linked list
	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	    }

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
	    
			
		}
	
	

