package zadania2;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("podaj liczbe z przedziału 1-10: ");
        int cyfra = liczba.nextInt();
        if (cyfra == 1) {
            System.out.println(" ta liczba w systemie rzymskim: I");
        } else if (cyfra == 2) {
            System.out.println(" ta liczba w systemie rzymskim: II");
        } else if (cyfra == 3) {
            System.out.println(" ta liczba w systemie rzymskim: III");
        } else if (cyfra == 4) {
            System.out.println(" ta liczba w systemie rzymskim: IV");
        } else if (cyfra == 5) {
            System.out.println(" ta liczba w systemie rzymskim: V");
        } else if (cyfra == 6) {
            System.out.println(" ta liczba w systemie rzymskim: VI");
        } else if (cyfra == 7) {
            System.out.println(" ta liczba w systemie rzymskim: VII");
        } else if (cyfra == 8) {
            System.out.println(" ta liczba w systemie rzymskim: VIII");
        } else if (cyfra == 9) {
            System.out.println(" ta liczba w systemie rzymskim: IX");
        } else if (cyfra == 10) {
            System.out.println(" ta liczba w systemie rzymskim: X");
        }else {
            System.out.println("błąd 404");
        }
    }
}
