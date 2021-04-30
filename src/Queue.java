
public class Queue {
		
		int front,rear;
		int max, current;
		
		
		char[] queue;
		
		
		public Queue(int max) {
			this.max = max;
			front = rear = -1;
			current = 0;
			queue = new char[max];
		}
		
		public boolean isEmpty() {
			return current == 0;
		}
		
		public boolean isFull() {
			return current == max;
		}
		
		public void enqueue(char el) {
			if(isFull()) return;
			if(front == -1) front = 0;
			rear = (rear + 1 ) % max;
			queue[rear] = el;
			current++;
		}
		
		public char dequeue() {
			if(isEmpty()) return ' ';
			char el = queue[front];
			
			front = (front + 1) % max;
			current--;
			return el;
		}
		
		public void print() {
			int start = front;
			for(int i = 0; i < current; i++) {
					System.out.print(queue[(start+ i) % max]);
			}
			System.out.println();
		}
}
