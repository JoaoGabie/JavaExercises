import java.util.Scanner;

public class Exercise19 {
  public static void main(String[] args) {
    System.out.println("============================");
    System.out.println(" Covert a number to binary  ");
    System.out.println("============================");

    Scanner sc = new Scanner(System.in);


    System.out.print("Enter your number: ");
      int binaryInput = sc.nextInt();
    String binaryString = Integer.toBinaryString(binaryInput);
    System.out.println("Binary number is " + binaryString);

  }
}