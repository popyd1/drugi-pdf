package zadania3;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;

        while (true) {
            System.out.print("Wprowadź literę 'T', 't', 'N' lub 'n': ");
            String input = scanner.next();


            if (input.length() == 1) {
                inputChar = input.charAt(0);


                if (inputChar == 'T' || inputChar == 't' || inputChar == 'N' || inputChar == 'n') {
                    break;
                }
            }

            System.out.println("Błędna wartość. Spróbuj ponownie.");
        }

        System.out.println("Wprowadzona litera jest poprawna: " + inputChar);
        scanner.close();

    }
}
