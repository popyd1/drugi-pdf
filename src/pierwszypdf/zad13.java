package pierwszypdf;

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        double porcja = 4;
        double kalorienaporcje = 300;
        Scanner ciastka = new Scanner(System.in);
        System.out.println("Ile zjadłeś ciastek: ");
        double iloscciastek = ciastka.nextInt();
        double kalorie = iloscciastek/porcja*kalorienaporcje;
        System.out.println("Skonsumowałeś "+kalorie+" kalorii");

    }
}
