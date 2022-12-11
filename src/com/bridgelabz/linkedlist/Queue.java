package com.bridgelabz.linkedlist;
public class Queue<E> {
    LinkedList<E> linkedList = new LinkedList<>();
    public Queue() {
    }
    public void enQueue(E data)
    {
        linkedList.append(data);
    }
    public void displayQueue()
    {
        linkedList.show();
    }
}
