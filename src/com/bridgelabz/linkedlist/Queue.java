package com.bridgelabz.linkedlist;
public class Queue<E> {
    LinkedList<E> linkedList = new LinkedList<>();
    Node<E> front = null;
    Node<E> rear = null;

    public Queue() {
    }
    public boolean isEmpty()
    {
        return front == null && rear == null;
    }
    public void enQueue(E data)
    {
        Node<E> newNode = new Node(data);
        if(isEmpty()) // empty queue
        {
            rear = front = newNode; // front and rear are at same point and same node
            return;
        }
        rear.setNext(newNode);
        rear = newNode;
    }
    public E deQueue(E data)
    {
        Node<E> newNode = new Node<>(data);
        if(front == null)
        {
            System.out.println("Queue is Empty");
        }
        E result = front.getData();
        front = front.getNext();
        return result;
    }
    public void displayQueue()
    {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }
    }
}
