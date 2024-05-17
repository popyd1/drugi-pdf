package zadania4;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków: ");
        String znaki = scanner.nextLine();
        System.out.println("Podaj znak do zliczenia: ");
        char znak = scanner.nextLine().charAt(0);
        int licznik = 0;
        for (int i = 0; i < znaki.length(); i++){
            if (znaki.charAt(i) == znak){
                licznik++;
            }
        }
        System.out.println("znka wystąpił: "+licznik);
        scanner.close();

    }
}
