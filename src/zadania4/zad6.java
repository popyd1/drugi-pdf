package zadania4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj nazwę pliku: ");
        String fileName = scanner.nextLine();


        System.out.print("Podaj znak, którego liczbę wystąpień chcesz policzyć: ");
        char targetChar = scanner.next().charAt(0);


        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int character;
            while ((character = reader.read()) != -1) {
                if ((char) character == targetChar) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu pliku.");
            e.printStackTrace();
        }

        // Wyświetlanie wyniku
        System.out.printf("Liczba wystąpień znaku '%c' w pliku '%s' to: %d%n", targetChar, fileName, count);

        scanner.close();
    }
}
