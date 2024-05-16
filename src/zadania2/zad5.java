package zadania2;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner masa = new Scanner(System.in);
        System.out.println("podaj mase obiektu: ");
        double waga = masa.nextDouble();
        double ciezar = waga*9.8;
        System.out.println("ciężar obiektu wynosi: "+ciezar+" niutonów");
        if (ciezar >= 1000) {
            System.out.println("obiekt jest za ciężki");
        }else if (ciezar <= 10) {
            System.out.println("obiekt jest za lekki");
        }else {
            System.out.println("ciężar obiektu w normie ");
        }
    }
}
