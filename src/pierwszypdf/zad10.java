package pierwszypdf;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner imiona = new Scanner(System.in);
        System.out.println("podaj Pierwsze Imię: ");
        String firstname = imiona.nextLine();
        imiona.nextLine();
        System.out.println("podaj Drugie Imie: ");
        String middlename = imiona.nextLine();
        imiona.nextLine();
        System.out.println("podaj Nazwisko: ");
        String lastname = imiona.nextLine();
        char firstinitial = firstname.charAt(0);
        char middleinitial = middlename.charAt(0);
        char lastinitial = lastname.charAt(0);
        System.out.println(firstinitial +"\n"+middleinitial+"\n"+lastinitial);

    }
}
