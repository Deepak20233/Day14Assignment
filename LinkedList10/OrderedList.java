package com.java;

public class OrderedList {
	    Node head;
	    
	    public OrderedList() {
	        this.head = null;
	    }
	    
	    // method to insert a node in ascending order
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null || head.data >= data) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        while (current.next != null && current.next.data < data) {
	            current = current.next;
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


