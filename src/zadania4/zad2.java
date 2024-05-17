package zadania4;


import java.util.Scanner;

public class zad2 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj prędkość (km/h): ");
        double predkosc = scanner.nextDouble();
        System.out.println("podaj czas podróży (h): ");
        double czas = scanner.nextDouble();
        double droga = predkosc*czas;
        for (int i = 1; i <= czas; i++) {
            double droga1 = predkosc*i;
            System.out.println(i+" godzina "+droga1);
        }


    }
}
