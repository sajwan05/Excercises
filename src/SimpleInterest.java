import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal");
        int p = in.nextInt();
        System.out.println("Enter the time period");
        int t = in.nextInt();
        System.out.println("Enter the rate of interest");
        double r = in.nextDouble();

        double sI=p*r*t/100;
        System.out.println("Simple interest is :"+sI);
        System.out.println("Total amount to be paid is :"+((double)p+sI));
    }
}
