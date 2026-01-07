package com.customstructure;

public class CustomLinkedList {
	Node head;
	Node last;
	
	static class Node {
		Object data;
		Node next;
		
		public Node(Object data) {
			this.data = data; 
		}	
	}
	
	public void insert(Object obj) {
		Node n = new Node(obj);
		if(head == null) {
			head = n;
			last = n;
		} else {
			if(last.next == null) {
				last.next = n;
				last = n;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node temp = head;
		while(temp != null) {
			sb.append(temp.data);
			if(temp.next != null) {
				sb.append(", ");
			}
			temp = temp.next;
		}
		return sb.toString();
	}
	
	public void remove() {
		//if head is null
		if(head == null) {
			return;
		}
		
		//if only one element
		if(head == last) {
			head = null;
			last = null;
			return;
		}
		
		//if more than one element
		Node temp = head;
		if(temp.next != last) {
			temp = temp.next;
		}
		
		temp.next = null;
		last = temp;
	}
	
	public static void main(String[] args) {
		CustomLinkedList cl = new CustomLinkedList();
		cl.insert(10);
		cl.insert(20);
		cl.insert(30);
		System.out.println(cl);
		
		cl.remove();
		System.out.println(cl);
	}
	
}



