package pierwszypdf;

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        double marza = 0.4;
        Scanner cenadetaliczna = new Scanner(System.in);
        System.out.println("podaj cene płytki: ");
        double cenaplytki = cenadetaliczna.nextDouble();
        double zysk = cenaplytki*marza;
        System.out.println("Zysk ze sprzedaży 1 płytki wynosi: "+zysk);
    }
}
