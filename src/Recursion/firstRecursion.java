package Recursion;

// Steps -
// 1 - Break down the problem into simpler problems
// 2 - Find the base condition


public class firstRecursion {
    public static void main(String[] args) {
        print(10);
    }

    static void print(int n){
        if(n==0){         // BASE CONDITION
            return;
        }
        print(n-1);
        System.out.println(n);
                 // RECURSIVE CALLS
    }
}
