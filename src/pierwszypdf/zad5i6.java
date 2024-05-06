package pierwszypdf;

public class zad5i6 {
    public static void main(String[] args) {
        double iloscosob = 4;

        double pomieszczenie1dlugosc = 3;
        double pomieszczenie1szerokosc = 4;
        double pomieszczenie1powierzchnia = pomieszczenie1dlugosc*pomieszczenie1szerokosc;

        double pomieszczenie2dlugosc = 3;
        double pomieszczenie2szerokosc = 4;
        double pomieszczenie2powierzchnia = pomieszczenie2dlugosc*pomieszczenie2szerokosc;

        double pomieszczenie3dlugosc = 2;
        double pomieszczenie3szerokosc = 3;
        double pomieszczenie3powierzchnia = pomieszczenie3dlugosc*pomieszczenie3szerokosc;

        double pomieszczenie4dlugosc = 2;
        double pomieszczenie4szerokosc = 2;
        double pomieszczenie4powierzchnia = pomieszczenie4dlugosc*pomieszczenie4szerokosc;

        double powierzchniacalkowita = pomieszczenie1powierzchnia+pomieszczenie2powierzchnia+pomieszczenie3powierzchnia+pomieszczenie4powierzchnia;
        double powierzchnianaosobe = powierzchniacalkowita/iloscosob;

        System.out.println("powierzchnia pierwszego pokoju wynosi: "+pomieszczenie1powierzchnia);
        System.out.println("powierzchnia drugiego pokoju wynosi: "+pomieszczenie2powierzchnia);
        System.out.println("powierzchnia trzeciego pokoju wynosi: "+pomieszczenie3powierzchnia);
        System.out.println("powierzchnia czwartego pokoju wynosi: "+pomieszczenie4powierzchnia);
        System.out.println("powierzchnia całkowita wynosi: "+powierzchniacalkowita);
        System.out.println("powierzchnia przypadająca na osobe wynosi: "+powierzchnianaosobe);
    }
}
