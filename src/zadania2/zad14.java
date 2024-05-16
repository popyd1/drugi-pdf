package zadania2;

import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner rzecz = new Scanner(System.in);
        System.out.println("podaj medium");
        String nosnik = rzecz.nextLine();
        rzecz.nextLine();
        System.out.println("podaj odległość: ");
        double droga = rzecz.nextDouble();
        if (nosnik.equalsIgnoreCase("powietrze")) {
            double czas = droga/343;
            System.out.printf("dzwięk doszedłby do nas w czasie %.2f s", czas);
        } else if (nosnik.equalsIgnoreCase("woda")) {
            double czas = droga/1490;
            System.out.printf("dzwięk doszedłby do nas w czasie %.2f s", czas);
        } else if (nosnik.equalsIgnoreCase("stal")) {
            double czas = droga/5100;
            System.out.printf("dzwięk doszedłby do nas w czasie %.2f s", czas);
        }
    }
}
