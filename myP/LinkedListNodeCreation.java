package com.myP;

public class LinkedListNodeCreation {
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null; // by default it will be initialised as null, no need to initialise it.
		}
		Node temp = new Node(5);//creating another node
	}

}
