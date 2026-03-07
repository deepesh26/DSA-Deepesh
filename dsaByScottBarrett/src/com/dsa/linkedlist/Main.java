package com.dsa.linkedlist;

public class Main {

	public static void main(String[] args) {
		CustomeLinkedList myLinkedList = new CustomeLinkedList(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.printList();
		myLinkedList.getLength();

		myLinkedList.prepend(0);
		myLinkedList.printList();
		myLinkedList.getLength();

		System.out.println("Remove Last: " + myLinkedList.removeLast().value);
		myLinkedList.getLength();
		myLinkedList.printList();

		System.out.println("Remove First: " + myLinkedList.removeFirst().value);
		myLinkedList.getLength();
		myLinkedList.printList();
		System.out.println("Get Node by index: " + myLinkedList.get(2).value);
		System.out.print(myLinkedList.set(1, 5) + "\n");
		myLinkedList.printList();
	}

}
