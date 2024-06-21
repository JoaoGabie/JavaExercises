import java.util.Scanner;

public class Exercise20 {
  public static void main(String[] args) {
    System.out.println("============================");
    System.out.println("   Covert a number to hex   ");
    System.out.println("============================");

    Scanner sc = new Scanner(System.in);


    System.out.print("Enter your number: ");
      int intValue = sc.nextInt();
    String HexString = Integer.toHexString(intValue);
    System.out.println("hex number is " + HexString);

  }

}