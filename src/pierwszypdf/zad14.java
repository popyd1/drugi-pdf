package pierwszypdf;

import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner oceny = new Scanner(System.in);
        System.out.println("podaj 1 wynik: ");
        double wynik1 = oceny.nextDouble();
        oceny.nextLine();
        System.out.println("podaj 2 wynik: ");
        double wynik2 = oceny.nextDouble();
        oceny.nextLine();
        System.out.println("podaj 3 wynik: ");
        double wynik3 = oceny.nextDouble();
        double srednia = (wynik1+wynik2+wynik3)/3;
        System.out.println("wynik pierwszego testu: "+wynik1);
        System.out.println("wynik drugiego testu: "+wynik2);
        System.out.println("wynik trzeciego testu: "+wynik3);
        System.out.println("Średnia wynosi: "+srednia);
    }
}
