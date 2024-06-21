import java.util.Scanner;

public class Exercise06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:" );
    int num1 = sc.nextInt();
    System.out.println("Enter the second number:" );
    int num2 = sc.nextInt();

    System.out.println("\nResults");
    System.out.println("Sum: " + (num1+num2));
    System.out.println("Subtraction: " + (num1-num2));
    System.out.println("Multiplication: "+num1*num2);
    System.out.println("Division: "+ num1/num2);
    System.out.println("Mod: "+ num1%num2);
  }
}