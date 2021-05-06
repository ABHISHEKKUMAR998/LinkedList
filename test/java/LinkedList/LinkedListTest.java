package LinkedList;
import static org.junit.Assert.*;
import org.junit.Test;

public class LinkedListTest {

	
		@Test
		public void given3Numbers_WhenAdded_ShouldBeAddedToTop() {
			MyNode<Integer> myFirstNode = new MyNode<>(70);
			MyNode<Integer> mySecondNode = new MyNode<>(30);
			MyNode<Integer> myThirdNode = new MyNode<>(56);
			LinkedList myLinkedList = new LinkedList();
			myLinkedList.add(myFirstNode);
			myLinkedList.add(mySecondNode);
			myLinkedList.add(myThirdNode);
			myLinkedList.printMyNode();
			boolean result = myLinkedList.head.equals(myThirdNode) && 
							 myLinkedList.head.getNext().equals(mySecondNode) && 
							 myLinkedList.tail.equals(myFirstNode);
			assertTrue(result);
		}
		@Test
		public void given3Numbers_WhenAppended_ShouldBeAddedToLast() {
			MyNode<Integer> myFirstNode = new MyNode<>(56);
			MyNode<Integer> mySecondNode = new MyNode<>(30);
			MyNode<Integer> myThirdNode = new MyNode<>(70);
			LinkedList myLinkedList = new LinkedList();
			myLinkedList.add(myFirstNode);
			myLinkedList.append(mySecondNode);
			myLinkedList.append(myThirdNode);
			myLinkedList.printMyNode();
			boolean result = myLinkedList.head.equals(myFirstNode) && 
							 myLinkedList.head.getNext().equals(mySecondNode) && 
							 myLinkedList.tail.equals(myThirdNode);
			assertTrue(result);
		}
		@Test
		public void given3NumbersInsertSecondInBetweenShouldPassTest() {
			MyNode<Integer> myFirstNode = new MyNode<>(56);
			MyNode<Integer> mySecondNode = new MyNode<>(30);
			MyNode<Integer> myThirdNode = new MyNode<>(70);
			LinkedList myLinkedList = new LinkedList();
			myLinkedList.add(myFirstNode);
			myLinkedList.append(myThirdNode);
			myLinkedList.insertNode(myFirstNode, mySecondNode);
			myLinkedList.printMyNode();
			boolean result = myLinkedList.head.equals(myFirstNode) && 
							 myLinkedList.head.getNext().equals(mySecondNode) && 
							 myLinkedList.tail.equals(myThirdNode);
			assertTrue(result);
		}
		@Test
		public void givenFirstElement_WhenDeleted_ShouldPassTest() {
			MyNode<Integer> myFirstNode = new MyNode<>(56);
			MyNode<Integer> mySecondNode = new MyNode<>(30);
			MyNode<Integer> myThirdNode = new MyNode<>(70);
			LinkedList myLinkedList = new LinkedList();
			myLinkedList.add(myFirstNode);
			myLinkedList.append(mySecondNode);
			myLinkedList.append(myThirdNode);
			INode deletedNode = myLinkedList.pop();
			System.out.println("Deleting the first Node: ");
			myLinkedList.printMyNode();
			boolean result = myLinkedList.head.equals(mySecondNode) &&
							 myLinkedList.head.getNext().equals(myThirdNode) && 
							 myLinkedList.tail.equals(myThirdNode);
			assertTrue(result);
		}
	}
