package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 51; i++) {
            System.out.print( fiboFormula(i)+" ");
        }
    }

    static int fibonacci(int n){
        if(n<2) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static int fiboFormula(int n){
            return (int)(( Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }


}
