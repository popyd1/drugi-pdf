package zadania3;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        int suma = 0;
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("podaj liczbe: ");
            int number = dane.nextInt();
            suma += number;
        }
        System.out.println("suma tych liczba to: "+suma);
    }
}
