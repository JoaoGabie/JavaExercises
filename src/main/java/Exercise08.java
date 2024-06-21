
/* Oque o chatgpt fez e que eu nao entendi ou nao sabia:
** 1- do-while (nao lembro como usa, assim como algumas estruturas de repetição)
** 2- bolean tryAgain (entendo o que ele fez, mas talvez nao fizesse assim)
** 3- .equals() (nao conhecia)
** 4- System.exit(0) (nao conhecia))
*/

import java.util.Scanner;

public class Exercise08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String JavaTrue = "JAVA";
    boolean tryAgain;

    do {
      System.out.println("Diga JAVA para aparecer o JAVA:");
      String JavaInput = sc.nextLine();

      if (JavaInput.toUpperCase().equals(JavaTrue)) {
        System.out.println("\n   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a\n");
      } else {
        System.out.println("Você não digitou JAVA");
      }

      System.out.println("Você quer tentar de novo? (s/n)");
      String response = sc.nextLine().toLowerCase();
      tryAgain = response.equals("s");
    } while (tryAgain);

    System.out.println("Programa encerrado.");
    System.exit(0);
  }
}
