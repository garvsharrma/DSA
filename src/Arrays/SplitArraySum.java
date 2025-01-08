public class SplitArraySum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }

    static int splitArray(int[] arr, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]); //max element from array - minimum answer (lower limit)
            end += arr[i]; //sum of entire array - maximum answer (upper limit)
        }// so now we have range

        while(start < end){
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for(int num:arr){
                if(sum + num<= mid){
                    sum += num;
                }else {
                    pieces++;
                    sum = num;
                }
            }
                if(pieces<=m){
                    end = mid;
                }else start = mid+1;


        }return end   ;

    }

}
