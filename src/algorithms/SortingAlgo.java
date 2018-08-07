package algorithms;

import java.util.Arrays;

public class SortingAlgo {
	public static void bubbleSort(int arrayToSort[], int n) {
		boolean isSwap = true;
		for (int i = 0; i < n && isSwap == true; i++) {
			isSwap = false;
			for (int j = 0; j < n - i; j++) {
				if (arrayToSort[j] > arrayToSort[j + 1]) {
					isSwap = true;
					swap(arrayToSort, j, j + 1);
				}
			}
		}
		System.out.println(Arrays.toString(arrayToSort));
	}

	public static void swap(int arrayToSort[], int x, int y) {
		int temp;
		temp = arrayToSort[x];
		arrayToSort[x] = arrayToSort[y];
		arrayToSort[y] = temp;
	}

	public static void insertionSort(int arrayToSort[], int n) {

		for (int i = 0; i < n; i++) {

			int temp = arrayToSort[i];
			int j = i;
			while (j > 0 && temp < arrayToSort[j - 1]) {
				arrayToSort[j] = arrayToSort[j - 1];
				j = j - 1;
			}
			arrayToSort[j] = temp;
		}
		System.out.println(Arrays.toString(arrayToSort));
	}

	public static void mergeSort(int arrayToSort[], int start, int end) {
		int mid = 0;
		if (start < end) {
			mid = (start + end) / 2;
			mergeSort(arrayToSort, start, mid);
			mergeSort(arrayToSort, mid + 1, end);

			merge(arrayToSort, start, mid, end);
		}

	}

	public static void merge(int arr[], int start, int mid, int end) {
		int p = start, q = mid + 1, k = 0;
		int tempArray[] = new int[end - start + 1];

		for (int i = start; i <= end; i++) {
			if (p > mid) {
				tempArray[k++] = arr[q++];
			} else if (q > end) {
				tempArray[k++] = arr[p++];
			} else if (arr[p] < arr[q]) {
				tempArray[k++] = arr[p++];
			} else if (arr[p] > arr[q]) {
				tempArray[k++] = arr[q++];
			}
		}
		
		for (int i = 0; i < k; i ++) {
			arr[start++] = tempArray[i];
		}

	}

}
