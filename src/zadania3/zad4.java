package zadania3;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner imie = new Scanner(System.in);
        System.out.println("podaj swoje imie: ");
        String word = imie.nextLine();
        for (int i = 1; i <= 10; i++) {
            System.out.println(word);
        }

    }
}
