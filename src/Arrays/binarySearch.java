import java.util.Arrays;
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {25, 24, 66, 78, 34, 48, 63, 97};
        int target = 97;    ;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Element found at index: " + binSearch(arr, target));
    }

    static int binSearch(int[] arr, int item){
        int low = 0;
        int high = arr.length;
        int mid = low+(high-low)/2;
        while(low<=high) {
            if (arr[mid] == item) {
                return mid;
            } else if (low>high) {
                
            } else if (arr[mid] > item) {
                high = mid - 1;
                mid = low+(high-low)/2;
            } else if (arr[mid] < item) {
                low = mid + 1;
                mid = low+(high-low)/2;
            }
        }return -1;
    }


}
