package pierwszypdf;

import java.util.Locale;
import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner miasto = new Scanner(System.in);
        System.out.println("podaj nazwe ulubionego miasta: ");
        String nazwa = miasto.nextLine();
        String nazwaduza = nazwa.toUpperCase();
        String nazwamala = nazwa.toLowerCase();
        char letter = nazwa.charAt(0);
        int liczba =nazwa.length();
        System.out.println("Liczba znaków: "+liczba);
        System.out.println("Nazwa z dużych: "+nazwaduza);
        System.out.println("Nazwa z małych: "+nazwamala);
        System.out.println("Pierwsza litera to: "+letter);

    }
}
