package com.bridgelabz.linkedlist;
public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

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
    public void show(){
        if (head==null){
            System.out.println("linked list is Empty");
        }else {
            Node<T> temp=head;
            while (temp!=null){
                System.out.println(temp.getData()+"");
                temp=temp.getNext();
            }
            System.out.println();
        }
    }
}
