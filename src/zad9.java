import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class zad9 {
    public zad9() {
        System.out.println("Podaj date rozpoczecia semestru: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rok:");
        int year = scan.nextInt();
        System.out.println("Podaj miesiac:");
        int month = scan.nextInt();
        System.out.println("Podaj dzien:");
        int day = scan.nextInt();
        System.out.println("Podaj godz (bez minut):");
        int hour = scan.nextInt();
        System.out.println("Podaj minuty:");
        int min = scan.nextInt();
        LocalDateTime sldt = LocalDateTime.of(year, month, day, hour, min);

        System.out.println("Podaj date zakonczenia semestru: ");
        System.out.println("Podaj rok:");
        int year1 = scan.nextInt();
        System.out.println("Podaj miesiac:");
        int month1 = scan.nextInt();
        System.out.println("Podaj dzien:");
        int day1 = scan.nextInt();
        System.out.println("Podaj godz (bez minut):");
        int hour1 = scan.nextInt();
        System.out.println("Podaj minuty:");
        int min1 = scan.nextInt();


        LocalDateTime zldt = LocalDateTime.of(year1, month1, day1, hour1, min1);

        Period daysBetween = sldt.toLocalDate().until(zldt.toLocalDate());

        System.out.println("Dzieli je: " + daysBetween.getMonths() + " miesiecy i " + daysBetween.getDays() + " dni.");
    }
}
