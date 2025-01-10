package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {121,12,43,31,11,41,54,71,82,86,33,23};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int r , int c, int max){
        if(r==0){
            return;
        }
        if(c < r){
            if(arr[max] < arr[c]){
                selectionSort(arr, r, c+1, c);     // pass the new max
            }else selectionSort(arr, r, c+1, max);   // pass the same max

        }else {
            swap(arr, max, r-1); // means we have the max now, and can be swapped with last element
            selectionSort(arr, r - 1, 0, 0); // move to the next row
        }
    }


    static void swap(int[] arr, int maxIndex, int start){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[start];
        arr[start] = temp;
    }

}
