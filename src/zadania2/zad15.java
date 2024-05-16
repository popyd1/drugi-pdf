package zadania2;

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("podaj liczbe książek: ");
        double ksiazka = liczba.nextDouble();
        if (ksiazka == 1) {
            System.out.println("otrzymujesz 5 punktów");
        } else if (ksiazka == 2) {
            System.out.println("otrzmujesz 15 punktów");
        } else if (ksiazka == 3) {
        System.out.println("otrzmujesz 30 punktów");
        } else if (ksiazka >= 4) {
        System.out.println("otrzmujesz 60 punktów");
        }
    }
}
