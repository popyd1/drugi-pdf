package zadania2;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner czas = new Scanner(System.in);
        System.out.println("podaj nazwisko zawodnika: ");
        String nazwisko1 = czas.nextLine();
        System.out.println("podaj czas biegu w minutach: ");
        double minuty1 = czas.nextDouble();
        czas.nextLine();
        System.out.println("podaj nazwisko 2 zawodnika: ");
        String nazwisko2 = czas.nextLine();
        System.out.println("podaj czas biegu w minutach: ");
        double minuty2 = czas.nextDouble();
        czas.nextLine();
        System.out.println("podaj nazwisko 3 zawodnika: ");
        String nazwisko3 = czas.nextLine();
        System.out.println("podaj czas biegu w minutach: ");
        double minuty3 = czas.nextDouble();
        if (minuty1 < minuty2 && minuty1 < minuty3 && minuty2 < minuty3) {
            System.out.println(nazwisko1+"\n"+nazwisko2+"\n"+nazwisko3);
        } else if (minuty1 < minuty2 && minuty1 < minuty3 && minuty3 < minuty2) {
            System.out.println(nazwisko1+"\n"+nazwisko3+"\n"+nazwisko2);
        } else if (minuty2 < minuty1 && minuty2 < minuty3 && minuty1 < minuty3) {
            System.out.println(nazwisko2+"\n"+nazwisko1+"\n"+nazwisko3);
        } else if (minuty2 < minuty1&& minuty2< minuty3 && minuty3< minuty1 ){
            System.out.println(nazwisko2+"\n"+nazwisko3+"\n"+nazwisko1);
        } else if (minuty3 < minuty2 && minuty3 < minuty1 && minuty2 < minuty1) {
            System.out.println(nazwisko3+"\n"+nazwisko2+"\n"+nazwisko1);
        } else if (minuty3 < minuty2 && minuty3 < minuty1 && minuty1 < minuty2) {
            System.out.println(nazwisko3+"\n"+nazwisko1+"\n"+nazwisko2);
        }
    }
}
