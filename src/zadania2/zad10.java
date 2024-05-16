package zadania2;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner makro = new Scanner(System.in);
        System.out.println("podaj zawartość tłuszczu w produkcie: ");
        double tluszcz = makro.nextDouble();
        System.out.println("podaj ilośc kalori w produkcie: ");
        double kalorie = makro.nextDouble();
        double kal_tl = tluszcz*9;
        double procent = kal_tl/kalorie;
        if (procent < 0.3) {
            System.out.printf("ten produkt zawiera %.2f procent tłuszczu ", procent*100);
            System.out.println("\n ten produkt jest nisko tłuszczowy");
        } else if (procent >=0.3 && procent <= 1) {
            System.out.printf("ten produkt zawiera %.2f procent tłuszczu", procent*100);
        }else if (procent >=1) {
            System.out.println("dane nieprawidłowe");
        }
    }
}
