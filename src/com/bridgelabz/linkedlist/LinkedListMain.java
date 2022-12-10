package com.bridgelabz.linkedlist;
public class LinkedListMain {
    public static void main(String[] args){
        LinkedList<Integer> list1=new LinkedList();
        list1.push(70);
        list1.push(30);
        list1.push(56);
        System.out.println("Linked list for list1 is->");
        list1.show();
/**
 * append 30 and 70 to 56
 */
        LinkedList<Integer> list2=new LinkedList();
        list2.append(56);
        list2.append(30);
        list2.append(70);
        System.out.println("Linked list for list2 is->");
        list2.show();
    }
}
