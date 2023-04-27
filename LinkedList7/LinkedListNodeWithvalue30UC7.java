package com.java;
import java.util.*;
public class LinkedListNodeWithvalue30UC7 {

	public static void main(String[] args) {
		LinkedList7 list = new LinkedList7();
        list.insert(56, 0);
        list.insert(30, 1);
        list.insert(70, 2);
        Node node = list.search(30);
        if (node != null) {
            System.out.println("Found node with value 30");
        } else {
            System.out.println("Node with value 30 not found");
        }


	}

}
