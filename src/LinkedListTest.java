
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		
		ll.addToN("Aui", 1);
		ll.addToN("Tail", 2);
		ll.addToN("Gitna", 3);
		ll.addToN("Gitna1", 3);
		ll.addToN("Gitna2", 4);
		ll.remove("Aui");
		ll.print();
	}

}
