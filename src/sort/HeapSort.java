/*
 * Created on Apr 22, 2018
 */
package sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HeapSort {

	public void sort(int arr[]) {
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int arr[], int n, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < n && arr[l] > arr[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < n && arr[r] > arr[largest])
			largest = r;

		// If largest is not root
		if (largest != i) {
			swapElement(arr, i, largest);

			// Recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}
	}

	public static void swapElement(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[]) {
		// int arr[] = {5, 6, 7,12, 11, 13,1,3};
//		int arr[] = { 5, 6, 3, 1, 2, 4 };
//		int n = arr.length;
//
//		HeapSort ob = new HeapSort();
//		ob.sort(arr);
//
//		System.out.println("Sorted array is");
//		printArray(arr);
		
		int arr[] = {5, 6,3, 1, 2,4}; 
		int a = 2;
		if(!IntStream.of(arr).anyMatch(x -> x == a)) {
			System.out.println("sdfdsf");
		}
        
        printSorted(arr, 0, arr.length-1); 
	}

	private static void printSorted(int[] arr, int start, int end) {
		if (start > end)
			return;

		// print left subtree
		printSorted(arr, start * 2 + 1, end);

		// print root
		System.out.print(arr[start] + " ");

		// print right subtree
		printSorted(arr, start * 2 + 2, end);
	}
}
