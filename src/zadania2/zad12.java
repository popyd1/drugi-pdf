package zadania2;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner czek = new Scanner(System.in);
        System.out.println("podj liczbe czeków:");
        double liczba_czek = czek.nextDouble();
        double oplata = 10;
        if (liczba_czek < 20) {
            double cena = (liczba_czek*0.1)+oplata;
            System.out.println("pobrane opłaty wynoszą:"+cena);
        } else if (liczba_czek >=20 && liczba_czek <=39) {
            double cena = (liczba_czek*0.08)+oplata;
            System.out.println("pobrane opłaty wynoszą: "+cena);
        } else if (liczba_czek >= 40 && liczba_czek <= 59) {
            double cena = (liczba_czek*0.06)+oplata;
            System.out.println("pobrane opłaty wynoszą: "+cena);
        } else if (liczba_czek >=60) {
            double cena = (liczba_czek*0.04)+oplata;
            System.out.println("pobrane opłaty wynoszą: "+cena);
        }
    }
}
