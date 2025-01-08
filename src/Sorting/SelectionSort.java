package Sorting;

// SELECTION SORT

// Select an element and place it to its correct position
// or Select the max element from the remaining array and place it at the last index

// Space Complexity - O(1)
// Time Complexity - Best Case - O(n^2)
//                 - Worst Case - O(n^2)

// is a UNSTABLE sorting algorithm - order is NOT preserved

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,7,4,5,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = FindMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }return arr;
    }

    static void swap(int[] arr, int maxIndex, int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    static int FindMaxIndex(int[] arr, int start, int last){
        int max = start;
        for (int i = 0; i <= last; i++) {
            if(arr[max] < arr[i])
                max = i;
        }return max;
    }

}
