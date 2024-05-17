package zadania3;

public class zad5 {
    public static void main(String[] args) {
        for (double i = 1; i<= 49; i++) {
            if (i/2 != (Math.ceil(i/2)) ) {
                System.out.println(i);
            }
        }
    }
}
