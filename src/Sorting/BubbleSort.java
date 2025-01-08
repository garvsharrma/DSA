package Sorting;
// - BUBBLE SORT (Sinking Sort / Exchange Sort)

// comparison bw adjacent elements
// after 1st pass the largest element will be at the end
// - so with each pass the largest element in the remaining array comes to the end

// Space Complexity - O(1)
// Time Complexity - Best Case - O(n) (Sorted)
//                 - Worst Case - O(n^2) (Sorted in reverse)

// is a stable sorting algorithm - order is preserved

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,7,4,5,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }


    static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    arr[j] = arr[j] ^ arr[j-1];
                    arr[j-1] = arr[j] ^ arr[j-1];
                    arr[j] = arr[j] ^ arr[j-1];
                    swap = true;
                }
            }if(swap == false) break;
        }return arr;
    }

}
