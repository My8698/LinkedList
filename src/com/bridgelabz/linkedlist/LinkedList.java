package com.bridgelabz.linkedlist;
public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    /**
     *push method to push elements in linked list
     */
    public void push(T data){
        Node<T> newNode=new Node<>(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.setNext(head);
            head=newNode;
        }
    }

    /**
     * show method to show elements in linked list
     */
    public void show(){
        if (head==null){
            System.out.println("linked list is Empty");
        }else {
            Node<T> temp=head;
            while (temp!=null){
                System.out.print(temp.getData() +" ");
                temp=temp.getNext();
            }
            System.out.println();
        }
    }

    /**
     *append elements in linked list
     */
    public void append(T data){
        Node newNode=new Node(data);
        if (head==null){
            tail=newNode;
            head=newNode;
        }
        else {
            tail.setNext(newNode);
            tail=newNode;
        }
    }
}
