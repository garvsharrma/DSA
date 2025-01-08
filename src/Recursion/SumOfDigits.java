package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1098));
        System.out.println(prodOfDigits(198));

    }

    static int sumOfDigits(int n){
        if(n<10) return n;
        return n%10 + sumOfDigits(n/10); // 8 + sumOfDigits(109) => 9 + sumoOfDigits(10) => 0 + sumOfDigits(1)
    }

    static int prodOfDigits(int n){
        if(n<10) return n;
        return n%10 * prodOfDigits(n/10); // 8 * prodOfDigits(109) => 9 * prodOfDigits(10) => 0 * prodOfDigits(1)
    }
}
