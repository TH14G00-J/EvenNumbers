import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }

        int qtdPares = 0;
        System.out.println("\nNUMEROS PARES:");
        for (int x : numbers) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
                qtdPares++;
            }
        }
        System.out.println("\nQuantidade de numeros pares = " + qtdPares);

        sc.close();
    }
}