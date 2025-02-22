package org.example.Leetcode_500;

import java.util.LinkedList;

public class Leetcode_876_Find_Middle_LinkedList {
public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public static Node head;
public static Node tail;
public void addFirst(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}

public Node middle(){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
    public static void main(String[] args) {
        Leetcode_876_Find_Middle_LinkedList list = new Leetcode_876_Find_Middle_LinkedList();
      list.addFirst(5);
      list.addFirst(4);
      list.addFirst(3);
      list.addFirst(2);
      list.addFirst(1);
        list.print();
       list.middle();
    }
    public void print(){
        Node newNode = head;
        while(newNode != null){
            System.out.print(newNode.data + " -> ");
            newNode = newNode.next;
        }
        System.out.println("NULL");
    }
}
