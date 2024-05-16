package zadania2;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner przesylka = new Scanner(System.in);
        System.out.println("ile wazy przesyłka (kg): ");
        double waga = przesylka.nextDouble();
        System.out.println("ile przejedzie kilometrów: ");
        double droga = przesylka.nextDouble();
        int odleglosc = (int)Math.ceil(droga/500);

        if (waga <= 1) {
            double cena = 1.1*odleglosc;
            System.out.println("dostawa kosztuje: "+cena);
        } else if (waga >=1 && waga <= 3) {
            double cena = 2.2*odleglosc;
            System.out.println("dostawa kosztuje: "+cena);
        } else if (waga >= 3 && waga <= 5) {
            double cena = 3.7*odleglosc;
            System.out.println("dostawa kosztuje: "+cena);
        } else {
            double cena = 3.8*odleglosc;
            System.out.println("dostawa kosztuje: "+cena);
        }
    }
}
