import java.util.Scanner;

import static java.lang.System.exit;

public class Operation {
    public static void main(String[] args) {
//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner in = new Scanner(System.in);
        System.out.println("enter both the number");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        System.out.println("Enter operation you want to perform:");
        char op = in.next().trim().charAt(0);

        if (op=='+' || op=='-' || op=='*' || op=='/' || op =='%'){
            double ans=0;
            if(op=='+'){
                ans = num1+num2;
            }
            else if(op=='-'){
                ans = num1-num2;
            }
            else if(op=='*'){
                ans = num1*num2;
            }
            else if(op=='/'){
                if(num2!=0){
                    ans = num1/num2;
                }else{
                    System.out.println("Division by zero!!");
                    System.out.println("Please enter non zero value in denominator");
                }
            }
            else if(op=='%'){
                ans = num1%num2;
            }
            System.out.println(ans);
        }else{
            System.out.println("Invalid operation");
        }


    }
}
