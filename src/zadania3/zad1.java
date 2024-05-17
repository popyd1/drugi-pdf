package zadania3;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Wprowadź liczbę z przedziału od 10 do 24: ");
            number = scanner.nextInt();

            if (number >= 10 && number <= 24) {
                break;
            } else {
                System.out.println("Błędna wartość. Spróbuj ponownie.");
            }
        }

        System.out.println("Wprowadzona liczba jest poprawna: " + number);
        scanner.close();
    }
}
