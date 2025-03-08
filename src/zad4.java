import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad4 {
    List <String> lista = new ArrayList<>();
    public zad4() {
        lista.add("ahbda");
        lista.add("gfa");
        lista.add("hdsdh");
        lista.add("dhdhdha");
        lista.add("dhkjas");
        lista.add("aksjf");
        System.out.println("Lista na start to: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public void usun(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ile wyrazow usunac: ");
        int ile = scan.nextInt();
        while (!(lista.isEmpty()) && ile > 0){
            int index = (int)(Math.random()*lista.size());
            if(lista.size() > index){
                lista.remove(index);
                ile -= 1;
            }
        }
        System.out.println("Lista po usunieciu: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
