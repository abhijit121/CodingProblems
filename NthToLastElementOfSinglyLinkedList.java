/*Author - rsan98k*/

/*How to find the nth-to-last element of a linked list.
Example - 1->2->3->4->5
input = 1 output=4
input = 2 output=3*/

class Node{
	int value; 
	Node next;

	Node(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

public class NthToLastElementOfSinglyLinkedList {
	public static void main(String[] args) {
		try {
		Node testNode = new Node(1);
		testNode.next = new Node(2);
		testNode.next.next = new Node(3);
		testNode.next.next.next = new Node(4);
		testNode.next.next.next.next = new Node(5);
		System.out.print(getNthToLastElement(testNode, 1).getValue());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	static Node getNthToLastElement(Node node, int n) {
		Node current = node;
		Node follower = node;

		for(int i=0; i<n;i++) {
			if(current==null) {
				return null;
			}
			current = current.next;
		}
		while(current.next != null) {
			current = current.next;
			follower = follower.next;
		}
		return follower;
	}

}
