package pierwszypdf;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        double iloscosob = 4;
        Scanner wartosc = new Scanner(System.in);
        System.out.println("Podaj długość pomieszczenia1: ");
        double pomieszczenie1dlugosc =  wartosc.nextDouble();
        wartosc.nextLine();
        System.out.println("Podaj szerokość pomieszczenia1: ");
        double pomieszczenie1szerokosc = wartosc.nextDouble();
        double pomieszczenie1powierzchnia = pomieszczenie1dlugosc*pomieszczenie1szerokosc;
        wartosc.nextLine();
        System.out.println("podaj długość pomieszczenia2: ");
        double pomieszczenie2dlugosc = wartosc.nextDouble();
        wartosc.nextLine();
        System.out.println("Podaj szerokość pomieszczenia2: ");
        double pomieszczenie2szerokosc = wartosc.nextDouble();
        wartosc.nextLine();
        double pomieszczenie2powierzchnia = pomieszczenie2dlugosc*pomieszczenie2szerokosc;
        System.out.println("podaj długość pomieszczenia3: ");
        double pomieszczenie3dlugosc = wartosc.nextDouble();
        wartosc.nextLine();
        System.out.println("podaj szerokość pomieszczenia3: ");
        double pomieszczenie3szerokosc = wartosc.nextDouble();
        wartosc.nextLine();
        double pomieszczenie3powierzchnia = pomieszczenie3dlugosc*pomieszczenie3szerokosc;
        System.out.println("podaj długość pomieszczenia4: ");
        double pomieszczenie4dlugosc = wartosc.nextDouble();
        wartosc.nextLine();
        System.out.println("podaj szerokość pomieszczenia4: ");
        double pomieszczenie4szerokosc = wartosc.nextDouble();
        double pomieszczenie4powierzchnia = pomieszczenie4dlugosc*pomieszczenie4szerokosc;

        double powierzchniacalkowita = pomieszczenie1powierzchnia+pomieszczenie2powierzchnia+pomieszczenie3powierzchnia+pomieszczenie4powierzchnia;
        double powierzchnianaosobe = powierzchniacalkowita/iloscosob;

        System.out.println("powierzchnia pierwszego pokoju wynosi: "+pomieszczenie1powierzchnia);
        System.out.println("powierzchnia drugiego pokoju wynosi: "+pomieszczenie2powierzchnia);
        System.out.println("powierzchnia trzeciego pokoju wynosi: "+pomieszczenie3powierzchnia);
        System.out.println("powierzchnia czwartego pokoju wynosi: "+pomieszczenie4powierzchnia);
        System.out.println("powierzchnia całkowita wynosi: "+powierzchniacalkowita);
        System.out.println("powierzchnia przypadająca na osobe wynosi: "+powierzchnianaosobe);
    }
}
