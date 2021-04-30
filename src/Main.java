



public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(1);
		
		stack.print();
		
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		
		
	//	permutation("helloworld".toCharArray(), 0);
		
		
		
		Queue queue = new Queue(6);
		
		queue.enqueue('g');
		queue.enqueue('i');
		queue.enqueue('o');
		queue.enqueue('r');
		queue.enqueue('n');
		queue.enqueue('o');
		queue.enqueue('e');
		queue.print();
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.print();
		
		
		HashTable ht = new HashTable(5);
		
		ht.insert("Angel", "AUI");
		ht.insert("Aui", "Hala");
		System.out.println(ht.get("Angel"));
		System.out.println(ht.get("Aui" ));
	}

	
	
		static void swap(char[] arr,int a, int b) {
				char temp = arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
		}
		
		
		
		static void permutation(char[] word, int index) {
			
			if(index == word.length - 1) {
				for(int i =0; i < word.length; i++) {
					System.out.print(word[i] + " ");
				}
				System.out.println();
			}
			
			for(int i = index; i < word.length; i++) {
				swap(word, index, i);
				permutation(word, i + 1);
				swap(word, index, i);
			}
		}
	}	


 