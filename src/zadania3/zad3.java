package zadania3;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Wprowadź tekst 'Tak' lub 'Nie': ");
            input = scanner.next();

            if (input.equalsIgnoreCase("Tak") || input.equalsIgnoreCase("Nie")) {
                break;
            } else {
                System.out.println("Błędna wartość. Spróbuj ponownie.");
            }
        }

        System.out.println("Wprowadzony tekst jest poprawny: " + input);
        scanner.close();
    }
}
