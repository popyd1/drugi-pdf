package pierwszypdf;

public class zad19 {
    public static void main(String[] args) {
        int konsumenci = 12467;
        double raztygodniwo = konsumenci*0.14;
        double cytrynowe = konsumenci*0.64;
        System.out.printf("Przybliżona liczba osób kupujących energetyki raz w tygodniu wynosi %.0f: \n ", raztygodniwo);
        System.out.printf("Przybliżona liczba osób kupujących enegetyki cytrynowe wynosi %.0f : ",cytrynowe);
    }
}
