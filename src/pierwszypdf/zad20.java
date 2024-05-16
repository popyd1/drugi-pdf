package pierwszypdf;

import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
        Scanner iloscciastek = new Scanner(System.in);
        System.out.println("podaj ilość oczekiwanych ciastek: ");
        double ciastka = iloscciastek.nextDouble();

        double cukier = 1.5/48;
        double maslo = 1.0/48;
        double maka = 2.75/48;

        System.out.println("Do takiej ilośći ciastek potrzebujesz");
        System.out.println(cukier*ciastka+" szklanek cukru");
        System.out.println(maslo*ciastka+" szklanek masła");
        System.out.println(maka*ciastka+" szklanek mąki");

    }
}
