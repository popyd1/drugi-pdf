package zadania2;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("poda dwie ostatnie cyfry roku: ");
        int rok = data.nextInt();
        System.out.println("podaj numer miesiąca: ");
        int miesiac = data.nextInt();
        System.out.println("podaj dzień miesiąca: ");
        int dzien = data.nextInt();
        if (dzien*miesiac==rok) {
            System.out.println("data jest magiczna");
        }else {
            System.out.println("data nie jest magiczna");
        }

    }
}
