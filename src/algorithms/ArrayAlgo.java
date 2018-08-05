package algorithms;

import java.util.Arrays;

public class ArrayAlgo {
	public static void rotateArrayM1(int arrayToRotate[], int d, int n) {
		int[] tempArray = new int[d];
		for(int i = 0; i < d ; i++) {
			tempArray[i] = arrayToRotate[i];
		}
		
		for(int i = d; i < n; i++) {
			arrayToRotate[i-d] = arrayToRotate[i];
		}
		
		for(int i = 0; i < d ; i++) {
			arrayToRotate[n - d + i] = tempArray[i];
		}
		System.out.println(Arrays.toString(arrayToRotate) );
	}
	
	public static void rotateArrayM2(int arrayToRotate[], int d, int n) {
		for (int i = 0; i < d; i++) {
			leftRotateByOne(arrayToRotate, n);
		}
		System.out.println(Arrays.toString(arrayToRotate) );
	}
	
	public static void leftRotateByOne(int array[], int n) {
		int i, temp = array[0];  
		for( i = 0; i < n-1; i++) {
			array[i] = array[i+1];
		}
		array[i] = temp;
	}
}
