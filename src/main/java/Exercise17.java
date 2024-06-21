import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número binário: ");
        String binario1 = scanner.nextLine();

        System.out.print("Digite o segundo número binário: ");
        String binario2 = scanner.nextLine();

        // Converter os números binários em inteiros decimais
        int decimal1 = Integer.parseInt(binario1, 2);
        int decimal2 = Integer.parseInt(binario2, 2);

        // Somar os números decimais
        int somaDecimal = decimal1 + decimal2;

        // Converter o resultado de volta para binário
        String somaBinaria = Integer.toBinaryString(somaDecimal);

        System.out.println("A soma em binário é: " + somaBinaria);

        scanner.close();
    }
}