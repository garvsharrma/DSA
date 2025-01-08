import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
       Scanner sc = new Scanner(System.in);

//       for(int i = 0; i< 5 ; i++){
//           int item = sc.nextInt();
//           list.add(item);
//        }
//        System.out.println("Array items are: ");
//
//       for(int i = 0; i<5; i++){
//           System.out.print(list.get(i)+" ");

//        for(int i= 0; i<3; i++){
//            list.add(new ArrayList<>());
//       }
//
//        for(int i = 0; i< 3; i++){
//            for(int j = 0; j < 3; j++) {
//                int item = sc.nextInt();
//               list.get(i).add(item);
//            }
//        }
//        System.out.println(list);

        // to swap 2 elements
        int[] arr = {100,42,32,53,4,5};

        System.out.println(Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(max(arr,3,4));

//        swap(arr, 0, 1);
//        System.out.println(Arrays.toString(arr));
    }
    static void swapIndex(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int max(int[] arr, int up, int down){
        int greatest = arr[up];
        for(int i=up;i<=down;i++){
            if(greatest<arr[i]){
                greatest = arr[i];
            }
        }return greatest;
    }

    static void swap(int[] arr){
        int j = arr.length-1;
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
                j--;
        }
    }
}
