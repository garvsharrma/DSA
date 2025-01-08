import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int result = 0;
        while(n>0){
            rem = n%10;
            result = (result * 10) + rem;
            n/=10;
        }
        System.out.println(result);
    }
}