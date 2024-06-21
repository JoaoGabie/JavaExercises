

public class Exercise09 {
  public static void main(String[] args) {

    double result = (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5);
    double reference = 2.138888888888889;

      if(result == reference) {
        System.out.println(result);
      } else {
        System.out.println("false");
    }
  }
}