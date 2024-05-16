package zadania2;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner wynik = new Scanner(System.in);
        System.out.println("podaj wynik 1 testu: ");
        double test1 = wynik.nextDouble();
        System.out.println("podaj wynik 2 testu: ");
        double test2 = wynik.nextDouble();
        System.out.println("podaj wynik 3 testu: ");
        double test3 = wynik.nextDouble();
        double srednia = (test1+test2+test3)/3;
        System.out.println("twoja srednia wynosi "+srednia);
        if (srednia >= 90) {
            System.out.println("otrzymujesz ocene 5");
        } else if (srednia >= 80 && srednia <= 89) {
            System.out.println("otrzymujesz ocene 4");
        } else if (srednia >= 70 && srednia <=79) {
            System.out.println("otrzymujesz ocene 3");
        } else if (srednia >=60 && srednia <=69) {
            System.out.println("otrzymujesz ocene 2");
        }else {
            System.out.println("otrzymujesz ocene 1");
        }
    }
}
