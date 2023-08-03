import java.util.Scanner;
public class CurrencyConversion {
    public static void main(String[] args){
//        Input currency in rupees and output in USD.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your salary in rupees:");
        double salary = in.nextDouble();

        double usdSalary = salary*0.012088;

        System.out.println("Your salary is USD is:"+usdSalary+"$");
    }
}
