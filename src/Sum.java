import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        Take integer inputs till the user enters 0 and print the sum of all numbers
        Scanner in = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter a number:");
            int n = in.nextInt();
            sum+=n;
            if(n==0){
                break;
            }
        }
        System.out.println(sum);
    }
}
