
public class Search {
		public static void main(String[] args) {
			int[] arr = {1,2,3,4,5};
			
			System.out.println(binarySearch(arr,7));
		}
		
		
		static int binarySearch(int[] arr, int s) {
			int i = 0, j = arr.length -1;
			
			while(i <= j) {
				int m = (i + j) / 2;
				
				if(arr[m] == s) return m;
				if(arr[m] > s) j = m - 1;
				else i = m + 1;
			}
			
			return -1;
		}
}
