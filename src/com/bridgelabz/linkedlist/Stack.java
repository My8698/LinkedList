package com.bridgelabz.linkedlist;

public class Stack<E> {
    LinkedList<E> linkedList=new LinkedList();
    public Stack(){ }
    public void push(E data)
    {
        linkedList.push(data);
    }
    public void show()
    {
        linkedList.show();
    }
}
