package zadania4;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int pietra;
        do {
            System.out.print("Podaj liczbę pięter w hotelu (co najmniej 1 piętro): ");
            pietra = scanner.nextInt();
        } while (pietra < 1);

        int wszystkie = 0;
        int wszystkie_zajete = 0;


        for (int i = 1; i <= pietra; i++) {

            int pokoje_na_pietrze;
            do {
                System.out.printf("Podaj liczbę pokojów na piętrze %d (co najmniej 10 pokojów): ", i);
                pokoje_na_pietrze = scanner.nextInt();
            } while (pokoje_na_pietrze < 10);


            System.out.printf("Podaj liczbę zajętych pokojów na piętrze %d: ", i);
            int zajete_na_pietrze = scanner.nextInt();


            wszystkie += pokoje_na_pietrze;
            wszystkie_zajete += zajete_na_pietrze;
        }


        double procent_zajete = (double) wszystkie_zajete / wszystkie * 100;


        System.out.println("\nWyniki:");
        System.out.println("==============================================");
        System.out.println("Łączna liczba pokojów w hotelu: " + wszystkie);
        System.out.println("Liczba zajętych pokojów: " + wszystkie_zajete);
        System.out.println("Liczba pustych pokojów: " + (wszystkie - wszystkie_zajete));
        System.out.printf("Poziom obłożenia: %.2f%%\n", procent_zajete);
        scanner.close();
        }
    }

