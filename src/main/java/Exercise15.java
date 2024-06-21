public class Exercise15 {
  public static void main(String[] args) {

    int x = 100, y = 200;

    System.out.print("Before Swap the variables: \nx = " + x +"\ny = " + y);

    int swap = x;
    x = y;
    y = swap;

    System.out.print("\n\nAfter Swap the variables:" + "\nx = " + x +"\ny = " + y);

    System.exit(0);


  }
}