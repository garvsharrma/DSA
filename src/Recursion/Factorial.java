package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sumOfNNumbers(10));
    }

    static int factorial(int n){
        if(n==1) return 1;
        return n * factorial(n-1);      // 5 * fact(4) -> 4 * fact(3) -> 3 * fact(2) -> 2 * fact(1)
    }

    static int sumOfNNumbers(int n){
        if(n==1) return 1;
        return n + sumOfNNumbers(n-1);      // 5 + fact(4) -> 4 + fact(3) -> 3 + fact(2) -> 2 + fact(1)
    }

}
