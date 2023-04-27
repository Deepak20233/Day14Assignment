package com.java;

public class LinkedList8 {
Node head;
    
    public LinkedList8() {
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
    
    // method to insert a node with a given value after a node with another given value
    public void insertAfter(int value, int newValue) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                Node newNode = new Node(newValue);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
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

