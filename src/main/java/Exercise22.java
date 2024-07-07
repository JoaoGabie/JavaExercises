import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
    System.out.println("============================");
    System.out.println(" Covert a binary to decimal ");
    System.out.println("============================");
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your Binary:" );
    String stringValue = sc.nextLine();
    int decimalString = Integer.parseInt(stringValue,2);
    System.out.println("Your decimal number is: " + decimalString);

    }
}
