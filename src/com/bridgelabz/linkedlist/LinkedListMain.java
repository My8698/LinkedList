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
/**
 * insert 30 between 56 and 70
 */
        LinkedList<Integer> list3 = new LinkedList();
        list3.append(56);
        list3.append(70);
        list3.searchAndInsert(56, 30);
        System.out.println("Linked list for list3 is->");
        list3.show();
        /**
         *delete first element of node
         */
        LinkedList<Integer> list4 = new LinkedList();
        list4.push(70);
        list4.push(30);
        list4.push(56);
        list4.popFirst();
        System.out.println("Linked list for list4 after deleting first element in linked list is->");
        list4.show();
        /**
         * delete last element of linkedlist
         */
        LinkedList<Integer> list5=new LinkedList<>();
        list5.push(70);
        list5.push(30);
        list5.push(56);
        list5.popLast();
        System.out.println("Linked list for list5 after deleting last element in linked list is->");
        list5.show();
        /**
         * Insert 40 after 30
         */
      System.out.println("****************************");
        LinkedList<Integer> list6=new LinkedList();
        list6.push(70);
        list6.push(30);
        list6.push(56);
        if (list6.search(30)==null)
            System.out.println("Element not found!");
        else
            System.out.println("Element Found");
        System.out.println("***************************");
        LinkedList<Integer> list7=new LinkedList();
        list7.push(70);
        list7.push(30);
        list7.push(56);
        boolean success=list7.searchAndInsert(30,40);
        if (success)
            System.out.println("Element searched and Inserted Element!");
        else
            System.out.println("Element Search unsucessful!");

        list7.show();
    }
}
