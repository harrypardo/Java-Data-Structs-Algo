
public class Stack {
		int top;
		int[] stack;
		
		int max;
		int current;
		
		public Stack(int max) {
			this.max = max;
			stack = new int[max];
			current = 0;
			top = -1;
		}
		
		
		public boolean isEmpty() {
			return current == 0;
		}
		
		public boolean isFull() {
			return current == max;
		}
		
		public void push(int el) {
			if(isFull()) return;
			stack[++top] = el;
			current++;
		}
		
		public int pop() {
			if(isEmpty()) return Integer.MIN_VALUE;
			int el = stack[top--];
			current--;
			return el;
		}

		public int peek() {
			if(isEmpty()) return Integer.MIN_VALUE;
			return stack[top]; 
		}
		
		public void print() {
			for(int i = 0; i < max; i++) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
}

