import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
//        Take name as input and print a greeting message for that particular name.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println("Hello !"+name);
    }
}
