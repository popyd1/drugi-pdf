package zadania4;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe przepracowanych dni");
        int dni = scanner.nextInt();
        double dniowka = 0.01;
        double pieniadze = 0;
        double suma = pieniadze*dni;
        if (dni > 0){
            for (int i = 1; i <= dni; i++){
                 pieniadze += dniowka;

                System.out.println(i+" dnia zarobiłeś: "+dniowka+" gr");
                dniowka *=2;
            }
            suma = (dniowka*dni)/100;
            System.out.println("w sumie zarobileś: "+suma+" zł");

        } else {
            System.out.println("do roboty nierobie");
        }

    }
}
