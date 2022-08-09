package dataStructures.linkedList;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insert(int data, int index) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else if (index == 0) {
			Node n = head;
			head = node;
			node.next = n; //node.next = head;	head = node;
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			Node n1 = n.next;
			n.next = node;
			node.next = n1;// node.next = n.next; n.next = node;
		}
	}

	public void deleteAtZero() {
		head = head.next;
		}

	public void delete(int index) {
		 if (index == 0) {
			 deleteAtZero();
			} else {
				Node n = head;
				for (int i = 0; i < index - 1; i++) {
					n = n.next;
				}
				Node n1 = n.next;
				n.next = n1.next;
			}
	}

	public void show() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
}
