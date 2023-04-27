package com.java;

public class SimpleLinkedListUC1 {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
	       
        Node head = linkedList.addNode(56, null);
       
        linkedList.addNode(30, head);
        linkedList.addNode(70, head);
       // System.out.println(head.next.next.data);
        linkedList.printLinkedList(head);
	}

}
