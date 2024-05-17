package zadania3;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueLoop;

        do {
            System.out.print("Wprowadź pierwszą liczbę: ");
            int number1 = scanner.nextInt();

            System.out.print("Wprowadź drugą liczbę: ");
            int number2 = scanner.nextInt();

            int sum = number1 + number2;
            System.out.println("Suma wprowadzonych liczb: " + sum);

            System.out.print("Czy chcesz wykonać operację ponownie? (tak/nie): ");
            continueLoop = scanner.next();
        } while (continueLoop.equalsIgnoreCase("tak"));

        System.out.println("Koniec programu.");
        scanner.close();
    }
}
