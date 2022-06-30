package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SingleLinkedListNode node = new SingleLinkedListNode(10);
        SingleLinkedList list = new SingleLinkedList(node);
        SingleLinkedListNode node1 = new SingleLinkedListNode(20);
        list.add(node1);
        System.out.println(list.head.value);
        System.out.println(list);
    }
}
