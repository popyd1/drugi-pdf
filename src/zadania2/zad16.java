package zadania2;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner pytania = new Scanner(System.in);
        System.out.println("czy ktoś jest na diecie wegetariańskiej: ");
        boolean wegetarianska = pytania.nextBoolean();
        System.out.println("czy ktoś jest na diecie wegańskiej: ");
        boolean weganska = pytania.nextBoolean();
        System.out.println("czy ktoś jest na diecie bezglutenowej: ");
        boolean gluten = pytania.nextBoolean();

        if (wegetarianska == true && weganska == false && gluten == false) {
            System.out.println(" Włoskie Specjały");
        } else if (wegetarianska == true && weganska == false && gluten == true) {
            System.out.println("pizzeria przy dworcu ");
        } else if (wegetarianska == true && weganska == true && gluten == true) {
            System.out.println("Kuchnia szefa lub \n Kawiarnia na rogu");
        } else if (wegetarianska == false && weganska == false && gluten == false) {
            System.out.println("luksusowe burgery u Jarka");
        }
    }
}
