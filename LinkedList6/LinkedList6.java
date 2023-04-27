package com.java;

public class LinkedList6 {
Node head;
    
    public LinkedList6() {
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
    
    // method to delete the last node in the list
    public void deleteLast() {
        if (head == null) {
            return;
        }
        
        if (head.next == null) {
            head = null;
            return;
        }
        
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        
        current.next = null;
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


