import java.util.Scanner;

public class Exercise12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type your first numeber: ");
    var n1 = sc.nextInt();
    System.out.println("\nType your second number: ");
    var n2 = sc.nextInt();
    System.out.println("\nType your third number: ");
    var n3 = sc.nextInt();

    int media = (n1 + n2 + n3) /3;
    close.Scanner();

    System.out.println("\n your media: " + media);
    System.exit(0);
  }

}