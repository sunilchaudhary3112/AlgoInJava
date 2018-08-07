package algorithms;

import java.util.Arrays;

public class CallAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test java Algorithms Program");
		//Array Problems
		//1. Rotation of Array by d elemnets
		//int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
		//ArrayAlgo.rotateArrayM1(array, 2, 7);
		//ArrayAlgo.rotateArrayM2(array, 2, 7);
		
		
		//SORTING PROBLEMS
		//Common array for all sorting algo
		int[] array = new int[] {2, 5, 6, 1, 8, 3, 9, 4, 7};
		
		//1. BUBBLE SORT
		//SortingAlgo.bubbleSort(array, array.length - 1);
		
		//2. Insertion Sort
		//SortingAlgo.insertionSort(array, array.length);
		
		//3. Merge Sort
		SortingAlgo.mergeSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
		// Linked List Problems 
//		LinkedList list = new LinkedList();
//		list.addNodeAtBegin(10);
//		list.addNodeAtBegin(20);
//		list.addNodeAtBegin(30);
//		list.addNodeAtBegin(40);
//		list.addNodeAtBegin(50);
		//checking
//		list.displayList();
	}

}
