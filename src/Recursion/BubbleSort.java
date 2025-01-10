package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,45,64,34,25,87,65};
        System.out.println(Arrays.toString(bubbleSort(arr, arr.length-1, 0)));
    }

    static int[] bubbleSort(int[] arr, int i, int j){
        if(i==0){
            return arr;
        }
        if(j<i) {
            if (j < arr.length - 1 && arr[j] > arr[j + 1]) {
                arr[j] = arr[j] ^ arr[j + 1];
                arr[j + 1] = arr[j] ^ arr[j + 1];
                arr[j] = arr[j] ^ arr[j + 1];
            }
            return bubbleSort(arr, i, j + 1);
        }
        else return bubbleSort(arr, i-1, 0);
    }

}
