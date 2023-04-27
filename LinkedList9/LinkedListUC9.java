package com.java;

public class LinkedListUC9 {

	public static void main(String[] args) {
		LinkedList9 list = new LinkedList9();
        list.insert(56, 0);
        list.insert(30, 1);
        list.insert(40, 2);
        list.insert(70, 3);
        list.delete(40);
        list.printList();
        System.out.println("Size of LinkedList is " + list.size());

	}

}
