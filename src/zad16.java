import java.util.Scanner;

public class zad16{
    public zad16() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj cyfre od 1 do 5: ");
        int a = 0;
        try{
            a = scan.nextInt();
            if(a > 5){
                throw new MyException("Liczba wieksza od 5");
            }
        }catch (MyException e){
            a = 5;
            System.out.println(e);
            System.out.println("Ustawiono a na 5");
        }


    }
}


class MyException extends Exception{
    public MyException(String s) {
        super(s);
    }

    public MyException() {
    }
}
