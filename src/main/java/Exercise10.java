
public class Exercise10 {
  public static void main(String[] args) {

    double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
    double reference = 2.9760461760461765;

      if(result == reference) {
        System.out.println(result + "\nvalue is true");
      } else {
        System.out.println("false");
    }
  }
}