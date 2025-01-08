package Sorting;

// INSERTION SORT

// Partially Sorting the array
// for every index element, put that element at its correct position(to its left)
// used for smaller value of n
// efficient if parts of arrays are sorted

// Space Complexity - O(1)
// Time Complexity - Best Case - O(n)
//                 - Worst Case - O(n^2)

// is a STABLE sorting algorithm - order is preserved

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 4, 5, 1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }


    static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {    // i loop to iterate through passes
            for (int j = i+1; j > 0; j--) {           // j loop to sort the LHS
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else break;                   // means that the left hand side is already sorted so break
            }
        }return arr;
    }
}
