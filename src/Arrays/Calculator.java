import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = ' ';
        int res = 0;
        while(true) {
            System.out.println("Enter operation, x or X to exit: ");
            ch = sc.next().trim().charAt(0);
            if(ch=='x' || ch == 'X')break;
            System.out.print("Enter first number:");
            int num1 = sc.nextInt();
            System.out.print("Enter second number:");
            int num2 = sc.nextInt();

            if (ch == '+'){
                res = num1+num2;
            }else if (ch == '-'){
                res = num1-num2;
            }else if (ch == '*'){
                res = num1*num2;
            }else if (ch == '/'){
                res = num1/num2;
            }
            System.out.println("Result is: "+res);
        }
    }
}
