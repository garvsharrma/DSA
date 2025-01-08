import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements: ");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter item to find: ");
        System.out.println("Item Found at index: " + findItem(arr, sc.nextInt()));
    }static int findItem(int[] arr, int item){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==item){
                return i;
            }
        }return -1;
    }
}
