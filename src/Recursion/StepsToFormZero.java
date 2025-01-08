package Recursion;

public class StepsToFormZero {
    public static void main(String[] args) {
        System.out.println(formZero(18, 0));
    }

    static int formZero(int n, int count){
        if (n == 0) return count;
        if(n % 2 == 0) return formZero(n / 2, count + 1);
        else return formZero(n - 1, count + 1);
    }

}
