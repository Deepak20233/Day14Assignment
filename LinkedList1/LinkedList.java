package com.java;

public class LinkedList {
	   public Node addNode(int data, Node head) {

	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;

	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	        return head;
	    }
	   
	    public void printLinkedList(Node head) {
	        if(head == null) {
	            System.out.print("LinkedList is empty");
	        }else {
	            Node temp = head;
	            while(temp != null) {
	                System.out.print(temp.data + " -> ");
	                temp = temp.next;
	            }
	        }
	    
			
		}
			
		}
			
