import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,59,6,10,20,30},
                {7,8,9}
        };
        int target = 30;
        System.out.println(max(arr));
        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int max(int[][] arr){
        int greatest = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(greatest<arr[row][col]){
                    greatest=arr[row][col];
                }
            }
        }return greatest;
    }
}
