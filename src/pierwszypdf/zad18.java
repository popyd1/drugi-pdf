package pierwszypdf;

public class zad18 {
    public static void main(String[] args) {
        double akcje = 600;
        double cenaakcji = 21.77;
        double prowzja = 0.2;
        double kwotaakcji = akcje*cenaakcji;
        double cenaprowizji = kwotaakcji*prowzja;
        double cenacalkowita = kwotaakcji+cenaprowizji;
        System.out.println("cena za akcje bez prowizji: "+kwotaakcji);
        System.out.println("cena prowizji: "+cenaprowizji);
        System.out.println("cena całkowita: "+cenacalkowita);

    }
}
