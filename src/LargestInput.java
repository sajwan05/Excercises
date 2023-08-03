import java.util.Scanner;

public class LargestInput {
    public static void main(String[] args) {
//        Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner in = new Scanner(System.in);
        int large =-5;
        while(true){
            System.out.println("Enter a number:");
            int n = in.nextInt();
            if(n==0){
                break;
            }else if (n>large){
                large=n;
            }else{

            }
        }
        System.out.println("largest number is: "+large);
    }
}
