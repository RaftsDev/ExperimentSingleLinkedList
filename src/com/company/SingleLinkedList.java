package com.company;

public class SingleLinkedList {
    public SingleLinkedListNode head;

    public SingleLinkedList(SingleLinkedListNode head) {
        this.head = head;
    }

    public void add(SingleLinkedListNode node){
        SingleLinkedListNode pointer = this.getLast();
        pointer.next = node;
    }

    public SingleLinkedListNode getLast(){
        SingleLinkedListNode pointer = this.head;
        while (pointer.next != null){
            pointer = pointer.next;
        }
        return pointer;
    }

    public int size(){
        SingleLinkedListNode pointer = this.head;
        int counter = 0;
        while(pointer.next != null){
            counter++;
        }
        return counter;
    }

    @Override
    public String toString() {
        String str = "";
        SingleLinkedListNode pointer = this.head;
            while (pointer.next!=null){
                str = str + String.valueOf(pointer.value)+",";
                pointer = pointer.next;
            }

            str = str+String.valueOf(pointer.value);
        return str;
    }
}
