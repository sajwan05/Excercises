import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
//        To calculate Fibonacci Series up to n numbers.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count=2;
        while(count<=n){
            int temp =b;
            b=b+a;
            a=temp;
            System.out.print(b+" ");
            count++;
        }
        System.out.println();
        System.out.println(n+"th fibo number is:"+b);
    }
}
