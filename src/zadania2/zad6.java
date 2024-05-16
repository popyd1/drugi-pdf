package zadania2;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner sekundy = new Scanner(System.in);
        System.out.println("Podaj liczbe sekund: ");
        double sekunda = sekundy.nextDouble();
        if (sekunda >= 60 && sekunda <3600) {
            double minuty = sekunda/60;

            System.out.printf("%.0f sekund to %.0f minut", sekunda, minuty);
        } else if (sekunda >= 3600 && sekunda < 86400) {
            double godzina = sekunda/3600;
            System.out.printf("%.0f sekund to %.0f godzin", sekunda, godzina);
        } else if (sekunda >= 86400) {
            double dni = sekunda/86400;
            System.out.printf("%.0f sekund to %.0f dni", sekunda, dni);
        }else {
            System.out.printf("%.0f sekund", sekunda);
        }

    }
}
