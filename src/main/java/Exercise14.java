import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Exercise14 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String palavra = sc.nextLine();

   System.out.println("Digite Estados Unidos para aparecer a bandeira: \n");


    if (palavra.equals("Estados Unidos")){
      System.out.println("* * * * * * ==================================");
      System.out.println(" * * * * *  ==================================");
      System.out.println("* * * * * * ==================================");
      System.out.println(" * * * * *  ==================================");
      System.out.println("* * * * * * ==================================");
      System.out.println(" * * * * *  ==================================");
      System.out.println("* * * * * * ==================================");
      System.out.println(" * * * * *  ==================================");
      System.out.println("* * * * * * ==================================");
      System.out.println("==============================================");
      System.out.println("==============================================");
      System.out.println("==============================================");
      System.out.println("==============================================");
      System.out.println("==============================================");
      System.out.println("==============================================");
    } else {
      System.out.println("Palavra nao encontrada");
    }

    System.exit(0);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}