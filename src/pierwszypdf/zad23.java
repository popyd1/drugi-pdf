package pierwszypdf;

import java.util.Scanner;

public class zad23 {
    public static void main(String[] args) {
        Scanner dlugosc = new Scanner(System.in);
        System.out.println("podaj długość rzędu w metrach: ");
        double rzad = dlugosc.nextDouble();
        System.out.println("podaj ilość zajmowanego miejsca przez okratowanie: ");
        double zajmowane = dlugosc.nextDouble();
        System.out.println(" podaj odległość między sadzonkami: ");
        double przerwa = dlugosc.nextDouble();
        double liczbasadzonek = (rzad-2*zajmowane) /przerwa;
        System.out.printf("w rzędzie zmieści się: %.0f sadzonek", liczbasadzonek);

    }
}
