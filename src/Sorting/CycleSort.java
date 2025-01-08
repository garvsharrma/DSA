package Sorting;


// CYCLE SORT

// ***** WHEN GIVEN RANGE FROM 1 to N USE CYCLE SORT ****

//

// Space Complexity - O(1)
// Time Complexity - Best Case - O(n)
//                 - Worst Case - O(n)

// is a STABLE sorting algorithm - order is preserved

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,3,5,6,7,1};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    static int[] cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[correct]!=arr[i]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }else i++;
        }return arr;

    }
}
