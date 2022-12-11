package com.bridgelabz.linkedlist;
public class StackMain {
    public static void main(String[] args) {
        System.out.println("Create stack using LinkedList");
        System.out.println("Push elements in the stack");
        Stack<Integer> stackObject=new Stack<>();
        stackObject.push(70);
        stackObject.push(30);
        stackObject.push(56);
        stackObject.show();
        System.out.println("********************************");
        System.out.println("Peak from the stack is :");
        stackObject.peak();
        System.out.println("Pop the elements in the top of the Stack ");
        stackObject.popStack();
        stackObject.show();
        System.out.println("Popped the element top of the stack ");
        stackObject.popStack();
        stackObject.show();
        System.out.println("Popped the element top of the stack ");
        stackObject.popStack();
        stackObject.show();
    }
}
