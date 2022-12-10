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

    public boolean searchAndInsert(T searchData, T insertData) {
        Node<T> newMyNode = new Node(insertData);
        Node<T> searchedMyNode = search(searchData);
        if (searchedMyNode == null)
            return false;
        else {
            newMyNode.setNext(searchedMyNode.getNext());
            searchedMyNode.setNext(newMyNode);
            return true;
        }
    }
    public Node<T> search(T searchData){
        Node<T> temp = head;
        while(temp != null) {
            if(temp.getData().equals(searchData))
                return temp;
            temp = temp.getNext();
        }
        return null;
    }
}
