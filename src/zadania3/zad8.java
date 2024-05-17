package zadania3;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product = 0;

        while (product < 100) {
            System.out.print("Wprowadź liczbę: ");
            int number = scanner.nextInt();
            product = number * 10;
            System.out.println("Wynik mnożenia przez 10: " + product);
        }

        System.out.println("Wartość zmiennej product jest równa lub większa niż 100. Koniec pętli.");
        scanner.close();
    }
}
