public class NumCeil {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,55,60,70,75,80,90};
        int target = 45;
        System.out.println(numCiel(arr, target));
    }

    static int numCiel(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        int mid = 0;
        while (start<=end){
            if(target>=arr[arr.length-1]) return arr[0];
            mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else if(target == arr[mid]){
                return arr[mid+1];
            }
        }return arr[start];
    }

}
