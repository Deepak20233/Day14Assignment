package com.java;
import java.util.*;
public class LinkedListInsertUC8 {

	public static void main(String[] args) {
		LinkedList8 list = new LinkedList8();
        list.insert(56, 0);
        list.insert(30, 1);
        list.insert(70, 2);
        list.insertAfter(30, 40);
        list.printList();

	}

}
