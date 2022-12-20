package edu.umb.cs681.hw19;

class LinkedList {
    Node head; // head of the list
 
    class Node {
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
}
