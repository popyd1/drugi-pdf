package zadania2;

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("wybierz pakiet");
        String pakiet = liczba.nextLine();
        liczba.nextLine();
        System.out.println("podaj czas rozmów w minutach: ");
        double czas = liczba.nextDouble();
        if (pakiet.equalsIgnoreCase("a")) {
            double cena = 39.99+((czas-450)*0.45);
            System.out.println("kwota za rozmowy wynosi: "+cena);
        } else if (pakiet.equalsIgnoreCase("b")) {
            double cena = 59.99+((czas-900)*0.40);
            System.out.println("kwota za rozmowy wynosi: "+cena);
        } else if (pakiet.equalsIgnoreCase("c")) {
            double cena = 69.99;
            System.out.println("kwota za rozmowy wynosi: "+cena);
        }
    }
}
