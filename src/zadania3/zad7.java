package zadania3;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        int suma = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("podaj liczbe: ");
            int dane = liczba.nextInt();
            suma += dane;
        }
        System.out.println("suma tych liczba to "+suma);
    }
}
