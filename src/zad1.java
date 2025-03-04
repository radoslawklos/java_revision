import java.util.ArrayList;
import java.util.List;

public class zad1 {
    public zad1() {
        int n = 10;
        int[] tab = new int[n];
        //lub
        List<Integer> list = new ArrayList<>();
        list.add(12);
        System.out.println(list);
        list.remove(list.indexOf(12));
        System.out.println(list);
    }
}
