package zadania4;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("podaj liczbe lat: ");
        int lata = scanner.nextInt();
        for (int i = 1; i <= lata; i++) {
            for (int p = 1; p <= lata*12; p++){
                System.out.println("podaj ilośc opadów w centymetrach: ");
                double opady = scanner.nextDouble();

            }
        }
    }
}
