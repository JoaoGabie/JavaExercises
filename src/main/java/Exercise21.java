import java.io.IOException;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            clearConsole(); // Limpar o console antes de exibir o menu

            System.out.println("============================");
            System.out.println("  Convert a number to octal ");
            System.out.println("============================");

            System.out.print("Enter your number: ");
            int intValue = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha residual
            String octalString = Integer.toOctalString(intValue).toUpperCase();
            System.out.println("Hex number is " + octalString);



            System.out.print("Quer tentar de novo? (s/n): ");
            resposta = sc.nextLine().trim().toLowerCase();
            clearConsole();
        } while (resposta.equals("s") || resposta.equals("sim"));

        System.out.println("Programa encerrado.");
        sc.close();
    }

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException ex) {
            System.out.println("Erro ao limpar o console.");
        }
    }
}
