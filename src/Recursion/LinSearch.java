package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class LinSearch {
    public static void main(String[] args) {
        int[] arr = {25, 1, 12, 25, 21, 26,12 ,14};
        System.out.println("Found at index: " +(search(arr, 25, 0)));
        System.out.println(searchMulti(arr, 25, 0));
        System.out.println(searchMultiple(arr, 25, 0, new ArrayList<Integer>()));
//        System.out.print(list);
    }

    static int search(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }if(target != arr[index]){
            return search(arr, target, index+1);
        }else return index;
    }

    static ArrayList<Integer> searchMulti(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(index == arr.length){
            return list;
        }if(target == arr[index]) {
            list.add(index);           // if found, add to the list
        }
            ArrayList<Integer> ansFromBelow = searchMulti(arr, target, index+1);     // then search in the remaining part of the array
            list.addAll(ansFromBelow);
            return list;
    }



    static ArrayList<Integer> searchMultiple(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }if(target == arr[index]) {
            list.add(index);           // if found, add to the list
        }
        return searchMultiple(arr, target, index+1, list);     // then search in the remaining part of the array
    }
}
