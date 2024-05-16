package zadania2;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner imiona = new Scanner(System.in);
        System.out.println("podaj 1 imie: ");
        String imie1 = imiona.nextLine();
        System.out.println("podaj 2 imie: ");
        String imie2 = imiona.nextLine();
        System.out.println("podaj 3 imie: ");
        String imie3 = imiona.nextLine();

        if (imie1.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie3) < 0 && imie2.compareToIgnoreCase(imie3) < 0) {
            System.out.println(imie1+"\n"+imie2+"\n"+imie3);
        } else if (imie2.compareToIgnoreCase(imie1) > 0 && imie2.compareToIgnoreCase(imie3) < 0 && imie1.compareToIgnoreCase(imie3) < 0) {
            System.out.println(imie2+"\n"+imie1+"\n"+imie3);
        } else if (imie1.compareToIgnoreCase(imie3) < 0 && imie1.compareToIgnoreCase(imie2) < 0 && imie3.compareToIgnoreCase(imie2) < 0) {
            System.out.println(imie1+"\n"+imie3+"\n"+imie2);
        } else if (imie2.compareToIgnoreCase(imie1) <0 && imie2.compareToIgnoreCase(imie3) < 0 && imie3.compareToIgnoreCase(imie1) < 0) {
            System.out.println(imie2+"\n"+imie3+"\n"+imie1);
        } else if (imie3.compareToIgnoreCase(imie1) < 0 && imie3.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie2) < 0) {
            System.out.println(imie3+"\n"+imie1+"\n"+imie2);
        } else if (imie3.compareToIgnoreCase(imie1) < 0 && imie3.compareToIgnoreCase(imie2) < 0 && imie2.compareToIgnoreCase(imie1) < 0) {
            System.out.println(imie3+"\n"+imie2+"\n"+imie1);
        }
    }
}
