import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        To find out whether the given String is Palindrome or not.
        /*
  hs
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = in.nextLine();
        String rev ="";
        int length = input.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        if (input.equals(rev)){
            System.out.println("Palindrome ");
        }else{
            System.out.println("Not a palindrome");
        }
        }
    }

