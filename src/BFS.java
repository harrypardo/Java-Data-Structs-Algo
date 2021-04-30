
public class BFS {
			
	
	
	
	
	static NodeQueue queue;
	
	
	static int[] X = {1,-1,0,0};
	static int[] Y = {0,0,1,-1};

	public  static class NodeQueue {
		
		int front,rear;
		int max, current;
		
		
		Node[] queue;
		
		
		public NodeQueue(int max) {
			this.max = max;
			front = rear = -1;
			current = 0;
			queue = new Node[max];
		}
		
		public boolean isEmpty() {
			return current == 0;
		}
		
		public boolean isFull() {
			return current == max;
		}
		
		public void enqueue(Node el) {
			if(isFull()) return;
			if(front == -1) front = 0;
			rear = (rear + 1 ) % max;
			queue[rear] = el;
			current++;
		}
		
		public Node dequeue() {
			if(isEmpty()) return null;
			Node el = queue[front];
			
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
	
	public static class Node {
		
		int x, y;
		
		int step;
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
			this.step = 0;
		}
		
		public Node(int x, int y, int step) {
			this.x = x;
			this.y = y;
			this.step = step;
		}
	}
	
	
	public static void main(String[] args) {
		char[][] map = {"SX...".toCharArray(),
				 ".X.X.".toCharArray(),
				 ".X.X.".toCharArray(),
				 ".X.X.".toCharArray(),
				 "...XG".toCharArray()};
		int N = map.length;
		int M = map[0].length;
		
	    queue = new NodeQueue(map.length * map.length + 5);
	   
	    Node start = new Node(0,0,0);
	    queue.enqueue(start);
	    boolean[][] visited = new boolean[N][M];
	    visited[0][0]= true;
	    while(!queue.isEmpty()) {
	    	Node current = queue.dequeue();
	    	
	    	if(map[current.x][current.y] == 'G') {
	    		System.out.println(current.step);
	    		break;
	    	}
	    	
	    	for(int i = 0; i< 4; i++) {
	    		int nx = current.x + X[i];
	    		int ny = current.y + Y[i];
	    		if(nx >= N || nx < 0 || ny < 0 || ny >=M || visited[nx][ny] || map[nx][ny] == 'X') continue;
	    		visited[nx][ny ] = true;
	    		queue.enqueue(new Node(nx,ny, current.step + 1));
	    	}
	    }
	}
	
		
}
