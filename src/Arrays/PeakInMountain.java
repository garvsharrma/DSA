public class PeakInMountain {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56,76,78,89,90,92,95,98,100,102,110,1000,98,96,56,45,32,12,5};
        System.out.println(findPeak(arr));

    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }return arr[start];
    }

}
