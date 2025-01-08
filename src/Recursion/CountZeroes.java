package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(1021021210, 0));
    }

    static int countZeroes(int n, int count){
        if(n==0) return count;
        int rem = n%10;
        if(rem==0) return countZeroes(n/10, count+1);
        else return countZeroes(n/10, count);
    }

}
