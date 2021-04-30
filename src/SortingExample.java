import java.util.Arrays;

public class SortingExample {

	static int[] unsorted = { 0, 1, 8, 3, 2, 30, 10 };

	public static void main(String[] args) {
		mergeSort(unsorted, 0, unsorted.length - 1);
		System.out.println(Arrays.toString(unsorted));
	}

	public static void selectionSort(int[] arr) {
		int min, minIndex;
		for (int i = 0; i < arr.length; i++) {
			min = arr[i];
			minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;

			}
		}
	}

	public static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	public static void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (int i = 0; i < n2; i++)
			R[i] = arr[m + 1 + i];

		int i = 0, j = 0, k = l;

		while (i < n1 && j < n2) {
			if (L[i] < R[j])
				arr[k++] = L[i++];
			else
				arr[k++] = R[j++];
		}

		while (i < n1)
			arr[k++] = L[i++];
		while (j < n2)
			arr[k++] = R[j++];
	}
}
