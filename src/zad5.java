import java.util.*;

public class zad5 {
    List <Integer> numbers = new ArrayList<>();
    public zad5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ile liczba wygenerowac: ");
        int ile = scan.nextInt();
        System.out.println("Podaj max wartosc: ");
        int max = scan.nextInt();
        System.out.println("Podaj min wartosc: ");
        int min = scan.nextInt();
        for (int i = 0; i < ile; i++) {
            Random random = new Random();
            numbers.add(random.nextInt(min, max));
        }
        int maxnum = Collections.max(numbers);
        int minnum = Collections.min(numbers);
        System.out.println("MAksymalna wartosc: ");
        System.out.println(maxnum);
        System.out.println("Minimalna wartosc: ");
        System.out.println(minnum);
    }
}
