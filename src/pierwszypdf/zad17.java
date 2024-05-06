package pierwszypdf;

import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        Scanner cenaposilku = new Scanner(System.in);
        System.out.println("podaj cene posiłku: ");
        double cena = cenaposilku.nextDouble();
        double podatek = cena*0.0675;
        double napiwek = (cena+podatek)*0.2;
        double cenacalkowita = cena+podatek+napiwek;
        System.out.println("cena posiłku: "+cena);
        System.out.println("wartość podatku: "+podatek);
        System.out.println("kwota napiwku: "+napiwek);
        System.out.println("cena całkowita: "+cenacalkowita);
    }
}
