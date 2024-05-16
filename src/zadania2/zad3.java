package zadania2;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);
        System.out.println("podaj wage: ");
        double waga = dane.nextDouble();
        System.out.println("podaj wzrost w metrach: ");
        double wzrost = dane.nextDouble();
        double BMI = waga/(wzrost*2);
        System.out.printf("twoje BMI wynosi: %.2f", BMI);
        if (BMI < 18.5) {
            System.out.println("masz niedowage");
        } else if (BMI >= 18.5 && BMI <= 25) {
            System.out.println(" \n waga prawidłowa");
        }else {
            System.out.println("masz nadwage");
        }

    }
}
