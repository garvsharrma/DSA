package Sorting;

import java.util.Arrays;

// APPROACH -
//STEP1- Consider a random pivot element from the array.
//STEP2 - check for violations, the elements on the LHS of the PIVOT must be less than the PIVOT element
// and the elements on the RHS of the PIVOT element must be greater than the PIVOT
//STEP3 - if there is violation, swap the elements.
//else low++ and high--;
//then after the first pass the pivot will be at correct position
//so recursively sort the remaining parts of the array


public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {50,41,13,32,71};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int low = start;
        int high = end;
        int pivot = start + (end - start)/2; // considering pivot to be the middle element
        while(low<=high){
            while(arr[low] < arr[pivot]){
                low++;
            }
            while(arr[high] > arr[pivot]){
                high--;
            }
            if(low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
                // now the pivot is at its correct position, sort the other parts.
            quickSort(arr, start, high);
            quickSort(arr, low, end);

        }
    }

}
