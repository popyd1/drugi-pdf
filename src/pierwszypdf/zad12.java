package pierwszypdf;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner kilometry = new Scanner(System.in);
        System.out.println("podaj liczbe przejechanych kilometrów: ");
        double droga = kilometry.nextDouble();
        Scanner paliwo = new Scanner(System.in);
        System.out.println("podaj ilość zuzytego paliwa: ");
        double iloscpaliwa = paliwo.nextDouble();
        double kilometrynalitrzepaliwa = droga/iloscpaliwa;
        System.out.println("Ilosć kilometrów przejechanych  na litrze paliwa wynosi: "+kilometrynalitrzepaliwa);

    }
}
