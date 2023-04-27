package com.java;

public class LinkedList2 {
    Node head;
    
    public LinkedList2() {
        this.head = null;
    }
    
    // method to append a new node to the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
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

