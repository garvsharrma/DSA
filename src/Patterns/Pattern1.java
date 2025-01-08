package Patterns;

//APPROACH -
// Step 1 - outer loop will run number of rows time
// Step 2 - identify in each row how many cols are there
// Step 3 - try to find the formula for cols
// Step 4 - identify what you want to print

public class Pattern1 {

    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern1(int n){
        for(int row = 0; row<n; row++){                 //*****
            for (int col = 0; col < 5; col++) {         //*****
                System.out.print("*");                  //*****
            }                                           //*****
            System.out.println();                       //*****
        }
    }

    static void pattern2(int n){
        for(int row = 1; row <= n; row++){              //*
            for (int col = 1; col <= row; col++) {      //**
                System.out.print("*");                  //***
            }                                           //****
            System.out.println();                       //*****
        }
    }

    static void pattern3(int n){
        for(int row = 1; row <= n; row++){              //*****
            for (int col = 1; col <= n-row+1; col++) {  //****
                System.out.print("*");                  //***
            }                                           //**
            System.out.println();                       //*
        }
    }

    static void pattern4(int n){
        for(int row = 1; row <= n; row++){              //1
            for (int col = 1; col <= row; col++) {      //12
                System.out.print(col+" ");              //123
            }                                           //1234
            System.out.println();                       //12345
        }
    }

    static void pattern5(int n){
        int c = 0;                                    //*
        for(int row = 1; row <= 2*n-1; row++){        //**
            c = row<=n?c+1:c-1;                       //***
            for (int col = 1; col <= c; col++) {      //****
                System.out.print("* ");               //***
            }                                         //**
            System.out.println();                     //*
        }
    }

    static void pattern6(int n){
        for(int row = 1; row <= n; row++){              //     *
            for (int col = 1; col <= n; col++) {        //    **
                int space = n-row;                      //   ***
                if (col <= space) {                     //  ****
                    System.out.print(" ");              // *****
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
