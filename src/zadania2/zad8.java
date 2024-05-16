package zadania2;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner ilosc = new Scanner(System.in);
        System.out.println("podaj liczbe pakietów: ");
        double liczba = ilosc.nextDouble();

        if (liczba <= 19 && liczba >=10) {
            System.out.println("rabat wynosi 20%");
            double cena1 = (liczba*99)*0.8;
        } else if (liczba <=49 && liczba >=20) {
            System.out.println("rabat wynosi 30%");
            double cena1= (liczba*99)*0.7;
            System.out.printf("cena po rabacie wynosi: %.2f", cena1);
        } else if (liczba >= 50 && liczba <= 99) {
            System.out.println("rabat wynosi 40%");
            double cena2 = (liczba*99)*0.6;
            System.out.printf("cena po rabacie wynosi: %.2f", cena2);
        } else if (liczba >= 100) {
            System.out.println("rabat wynosi 50%");
            double cena3 = (liczba*99)*0.5;
            System.out.printf("cena po rabacie wynosi: %.2f", cena3);
        }else {
            System.out.println("ni ma rabata");
        }


    }
}
