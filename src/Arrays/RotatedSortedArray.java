public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {100,110,78,89,90};
        int target = 2   ;
        int pivot = findPeak(arr);
        int firstTry = binarySearch(arr,target,0,pivot);
        if(firstTry != -1){
            System.out.println(firstTry);
        }else {
            System.out.println(binarySearch(arr, target, pivot+1, arr.length-1));
        }
    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid<end && arr[mid] > arr[mid + 1]){
                return mid;
            }else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            } else if (arr[start]>=arr[mid]) {
                end =  mid-1;
            } else if (arr[start]<arr[mid]) {
                start = mid;
            }
        }return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid-1;
            }else if (target > arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }return -1;
    }

}
