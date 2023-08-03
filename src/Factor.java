import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
//        Input a number and print all the factors of that number (use loops).
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        int count =2;
        while(count<=Math.sqrt(n)){
            if(n%count==0){
                System.out.print(count+" ");
            }
            count++;
        }
        System.out.println();
    }
}
