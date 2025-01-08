public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {10,12,18,2,4,6,8};
        System.out.println(rotationCount(arr));

    }

    static int rotationCount(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid+1;
            }else if(mid>start && arr[mid] < arr[mid-1]){
                return mid;
            } else if (arr[start]>arr[mid]) {
                end = mid - 1;
            }else{
                start = mid;
            }
        }return start+1;
    }

}
