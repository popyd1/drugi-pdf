package zadania4;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj kraniec przedziału (dodatni): ");
        int liczba = scanner.nextInt();
        int suma = 0;
        if (liczba >= 0){
            for (int i = 1; i <= liczba; i++) {
                suma = suma+i;
            }
            System.out.println("suam liczba z tego przedziału wynosi: "+suma);
        }else {
            System.out.println("błądne dane. Spróbuj ponownie");
        }

    }
}
