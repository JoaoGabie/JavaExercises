import java.util.Scanner;

public class Exercise05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num1= sc.nextInt();
    System.out.println("Enter another number: ");
    int num2= sc.nextInt();

    System.out.println(num1*num2);
  }
}