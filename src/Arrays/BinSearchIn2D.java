import java.util.Arrays;
public class BinSearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {12,22,32,42},
                {17,27,37,47},
                {19,29,39,49}
        };
        int target = 11;
        int[] ans = binarySearchIn2D(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] binarySearchIn2D(int[][] arr, int target){
        int row = 0;
        int col = arr[row].length-1;
        while(row<arr.length && col >=0){
            if(target == arr[row][col]){
                return new int[] {row, col};
            }else if(target < arr[row][col]){
                col--;
            } else if (target > arr[row][col]) {
                row++;
            }
        }return new int[] {-1,-1};
    }

}
