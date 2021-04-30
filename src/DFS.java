import java.util.Arrays;

public class DFS {
	
	
		static int[] X = {1,-1,0,0};
		static int[] Y = {0,0,1,-1};
		
		public static void main(String[] args) {
			char[][] map = {"SX...".toCharArray(),
					 ".X.X.".toCharArray(),
					 ".X.X.".toCharArray(),
					 ".X.X.".toCharArray(),
					 "...XG".toCharArray()};
			
			
			  boolean [][] visited = new boolean[5][5];
			  int[][] step = new int[5][5];
			  
			  dfs(new Node(0,0,0), map, visited ,step);
			  System.out.println(Arrays.deepToString(step));
			  
			  for(int i =0 ; i< 5; i++) {
				  for(int j = 0; j <5; j++) {
					  System.out.print(step[i][j] + " ");
				  }
				  System.out.println();
			  }
		}
		
		
		public  static class Node {
			
			int x, y, step;
			
			public Node(int x, int y, int step) {
				this.x = x;
				this.y = y;
				this.step = step;
			}
			
			public Node(int x, int y) {
				this.x = x;
				this.y = y;
				this.step = 0;
			}
		}
		
		
		public static void dfs(Node node, char[][] arr, boolean[][] visited, int[][] step) {
			if(!visited[node.x][node.y]) {
				visited[node.x][node.y] = true;
				for(int i = 0; i < 4; i++) {
					int nx = node.x + X[i];
					int ny= node.y + Y[i];
					if(nx < 0 || nx >=5 || ny < 0 || ny >=5 || visited[nx][ny] || arr[nx][ny] == 'X') continue;
					step[nx][ny] += step[node.x][node.y] + 1;
				
					dfs(new Node(nx,ny, node.step + 1), arr, visited, step );
				} 
			}
		}
}	
