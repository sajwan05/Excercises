import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        //fibonaacii series
//        0 1 1 2 3 5 8 13 21 34 55 89 144 233
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        int a=0,b=1,count=2;
        while(count<=n){
            int temp = b;
            b =a+b;
            a=temp;
            System.out.print(b+" ");
            count++;
        }
    }
}
