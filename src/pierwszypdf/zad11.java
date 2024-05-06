package pierwszypdf;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        double procentpodateklokalny = 0.02;
        double procentpodatekstanowy = 0.04;
        Scanner wartoscproduktu = new Scanner(System.in);
        System.out.println("Podaj warotść produktu: ");
        double wartosc = wartoscproduktu.nextDouble();
        double podateklokalny = wartosc * procentpodateklokalny;
        double podatekstanowy = wartosc * procentpodatekstanowy;
        double cenacałkowita = wartosc+podatekstanowy+podateklokalny;
        System.out.println(" Cena produktu to: "+wartosc+" podatek lokalny wynosi: "+podateklokalny+" podatek stanowy wynosi: "+podatekstanowy+" cena całkowita wynosi: "+cenacałkowita);
    }
}
