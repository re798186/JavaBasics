package dataStructures.linkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(21);
		list.insert(31);
		list.insert(4,0);
		list.insert(2,2);
		list.show();
		list.delete(3);
		list.show();
	}

}
