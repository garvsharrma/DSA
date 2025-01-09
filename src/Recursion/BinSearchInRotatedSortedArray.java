package Recursion;

public class BinSearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3};
        System.out.println(search(arr, 5, 0, arr.length-1));
        System.out.println(search(arr, 6, 0, arr.length-1));
        System.out.println(search(arr, 7, 0, arr.length-1));
        System.out.println(search(arr, 8, 0, arr.length-1));
        System.out.println(search(arr, 1, 0, arr.length-1));
        System.out.println(search(arr, 2, 0, arr.length-1));
        System.out.println(search(arr, 3, 0, arr.length-1));
        System.out.println(search(arr, 9, 0, arr.length-1));

    }

    static int search(int[] arr, int target, int start, int end){
        int mid = start + (end - start ) / 2;
        if(start>end){
            return -1;
        }
        if(arr[mid] == target)
            return mid;

        if(arr[start] < arr[mid]){
            if(target >= arr[start] && target <= arr[mid-1]){
                return search(arr, target, start, mid-1);
            }else return search(arr, target, mid+1, end);
        }
        if(target >= arr[mid] && target <= arr[end]){
            return search(arr, target, mid+1, end);
        }
        return search(arr, target, start, mid-1);

    }

}
