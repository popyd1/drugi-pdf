package zadania3;

public class zad6 {
    public static void main(String[] args) {
        for (double i = 1; i <= 100; i++) {
            if (i/5 == Math.ceil(i/5))
                System.out.println(i);
        }
    }
}
