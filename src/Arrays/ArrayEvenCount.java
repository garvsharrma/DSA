public class ArrayEvenCount {
    public static void main(String[] args) {
        int[] arr = {1,654,664,654,684,887,391,88,3,8,321,877,846};
        System.out.println("Number of even elements: " + countEven(arr));}
//    }static int countEven(int[] arr){
//        int count = 0;
//        for(int element : arr){
//            if(isEven(element)){
//                count++;
//            }
//        }return count;
//    }

        static int countEven(int[] arr){
            int count = 0;
            int numbers = 0;
            for(int i = 0; i<arr.length; i++){
            String str = arr[i] + "";
            count = str.length();}
            if(count%2==0)
                numbers++;
            return numbers;
        }

    static boolean isEven(int element){
        int digits = 0;
        while(element>0){
            digits++;
            element /= 10;
        }
        return digits % 2 == 0;
    }
}
