package pierwszypdf;

public class zad22 {
    public static void main(String[] args) {
        double liczbaakcji = 1000;
        double cenaakcji = 32.87;
        double prowizjabankiera = 0.02;
        double cenasprzedazy = 33.92;
        double cenazakupu = liczbaakcji*cenaakcji;
        double procentzakupu = cenazakupu*prowizjabankiera;
        double zysk = liczbaakcji*cenasprzedazy;
        double procentsprzedazy = zysk*prowizjabankiera;
        double czystyzysk = zysk-(cenazakupu+procentsprzedazy+procentzakupu);
        System.out.println("jacek zapłacił: "+cenazakupu);
        System.out.println("prowizja bankiera za zakup wynosi:  "+procentzakupu);
        System.out.println("jacek sprzedał akcje za "+zysk);
        System.out.println("prowizja za sprzedaż bankiera wynosi: "+procentsprzedazy);
        System.out.println("jacek zyskał:  "+czystyzysk);

    }
}
