package Recursion;

public class ArrSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(sorted(arr));
    }

    static boolean sorted(int[] arr){
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] < arr[index+1]){
            return helper(arr, index+1);
        }else return false;

    }


}
