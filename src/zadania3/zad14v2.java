package zadania3;

public class zad14v2 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.print("#");

            if (i == 0) {
                System.out.print("#");
            } else {

                for (int j = 0; j < i ; j++) {
                    System.out.print(" ");
                }
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
