
public class LinkedList {	
		
		static class Node {
			String key;
			String info;
			Node next, prev;
			
			public Node(String info) {
				this.info = info;
				next = prev = null;
			}
			
			public Node(String key, String info) {
				this.info = info;
				this.key = key;
				next = prev = null;
			}
			
			void clear() {
				next = prev = null;
			}
		}
		
		Node head, tail;
		
		void addToHead(String info) {
			Node el = new Node(info);
			if(head == null) {
				head = tail = el;
				return;
			}
			
			el.next = head;
			head.prev = el;
			head = el;
		}
		
		void addToTail(String info) {
			Node el = new Node(info);
			if(tail == null) {
				head = tail = el;
				return;
			}
			
			el.prev = tail;
			tail.next = el;
			tail = el;
		}
		
		
		void addToTail(String key, String info) {
			Node el = new Node(key, info);
			if(tail == null) {
				head = tail = el;
				return;
			}
			
			el.prev = tail;
			tail.next = el;
			tail = el;
		}
		
		
		void addToN(String info, int N) {
			Node el = new Node(info);
			if(head == null) {
				head = tail = el;
				return;
			}
			
			Node ptr = head;
			int counter = 1;
			
			while(ptr != null) {
				if(counter == N) {
					
					
					
					Node prv = ptr.prev;
					
					el.next = ptr;
					el.prev = prv;
					
					
					 ptr.prev = el;
					
					 prv.next = el;
					
					return;
				}
				counter++;
				ptr = ptr.next;
			}
			
			
			this.addToTail(info);
		}
		
		void remove(String info) {
			Node ptr = head;
			
			while(ptr != null) {
				
				if(ptr.info.equals(info)) {
					Node prv = ptr.prev;
					Node nxt = ptr.next;
					
					if(nxt != null) nxt.prev =prv;
					if(prv!= null) prv.next = nxt;
					
					if(nxt == null) tail = prv;
					if(prv == null) head = nxt;
					
				}
				ptr = ptr.next;
			}
			
		}
		
		String get(String key) {
			Node ptr = head;
			while(ptr != null) {
				if(ptr.key.equals(key)) return ptr.info;
				ptr = ptr.next;
			}
			return "";
		}
		
		void print() {
			Node ptr = head;
			while(ptr != null) {
				System.out.println(ptr.info);
				ptr = ptr.next;
			}
		}

		
	
}
