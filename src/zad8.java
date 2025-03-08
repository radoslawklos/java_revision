import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad8 {
    List <Double> liczby = new ArrayList<>();
    public zad8() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ile liczb: ");
        int ile = scan.nextInt();
        for (int i = 0; i < ile; i++) {
            System.out.println("podaj liczbe: ");
            double liczba = scan.nextDouble();
            liczby.add(liczba);
        }
        System.out.println("Przed zwiekszeniem: ");
        System.out.println(liczby);
        zwieksz(12);
        System.out.println("Po zwiekszeniem: ");
        System.out.println(liczby);
    }

    public void zwieksz(double nval){
        for (int i = 0; i < liczby.size(); i++) {
            double tmp = liczby.get(i) + nval;
            liczby.set(i, tmp);
        }
    }
}
