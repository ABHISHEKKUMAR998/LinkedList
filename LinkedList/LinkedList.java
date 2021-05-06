package LinkedList;

public class LinkedList<K extends Comparable<K>>{
	public INode head;
	public INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	


	public void printMyNode() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
	
	
	

	public void append(INode myNode) {
		if (this.tail == null) {
			this.tail = myNode;
		}
		if (this.head == null) {
			this.head = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	
	

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	
	
	public INode popLast() {
		INode tempNode = this.head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}
	
	
	
	public INode search(Integer key) {
		INode tempNode = this.head;
		INode found = null;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey() == key) {

				found = tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return found;
	}
	
	public int size() {
		int size = 0;
		INode n = head;
		while (n != null) {
			size++;
			n = n.getNext();
		}
		return size;
	}
	
	
	public void removeParticularNode(INode deleteNode) {
		INode tempNode = this.head;
		INode prev = null;
		while (tempNode != null && tempNode.getKey() != deleteNode.getKey()) {
			prev = tempNode;
			tempNode = tempNode.getNext();
		}
		prev.setNext(tempNode.getNext());
		tempNode.setNext(null);
	}
	
	public static <K extends Comparable<K>> boolean maximum(K x, K y) {
		K max = x;
		if (y.compareTo(max) > 0) {
			return true;
		} else {
			return false;
		}
	}

	public <K extends Comparable<K>> void sortList() {
		INode<K> current = this.head;
		INode<K> index = null;
		K temp;
		if (this.head == null)
			return;
		else {
			while (current != null) {
				index = current.getNext();
				while (index != null) {
					if (maximum(index.getKey(), current.getKey())) {
						temp = current.getKey();
						current.setKey(index.getKey());
						index.setKey(temp);
					}
					index = index.getNext();
				}
				current = current.getNext();
			}
		}
	}
	
	
} 