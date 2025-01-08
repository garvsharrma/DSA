package Recursion;

public class ReverseTheNumber {        //1st way
    static int sum = 0;
    static void reverseNumber(int n){
        if(n==0) return;
        int rem = n%10;
        sum = sum * 10 + rem;
        reverseNumber(n/10);
    }

    static int reverseNumber2(int n){
        int digits = (int)Math.log10(n)+1;      // to calc number of digits
        return helper(n, digits);
    }

    private static int helper(int n, int digits){
        if(n<10) return n;
        return (n%10 * (int)Math.pow(10, digits - 1) + helper(n/10, digits-1));
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber2(1234)); // 2nd way
        reverseNumber(9866);
        System.out.println(sum);
    }


}
