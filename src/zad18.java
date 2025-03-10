import java.util.*;

public class zad18 {
    public zad18() {
        int [] userIDs = {123,456,789,156,236,912};
        //usunac mozna na kilka sposobow
        //sposob jeden: zastap 0
        //userIDs[3] = 0;
        //zastapic mniejsza tablica
        userIDs = new int[]{userIDs[1], userIDs[2], userIDs[3], userIDs[4]};
        for (int i = 0; i < userIDs.length; i++) {
            System.out.println(userIDs[i]);
        }
        List <String> names = new ArrayList<>();
        names.add("John");
        names.add("Abe");
        names.add("Jude");
        names.add("Paul");
        names.add("Abe");
        System.out.println(names);
        names.remove("John");
        System.out.println(names);

        Set <String> names2 = new TreeSet<>();
        names2.add("John");
        names2.add("Jude");
        names2.add("Jude");
        names2.add("Frank");
        names2.add("Todd");
        System.out.println(names2);

        Map <Integer, String> id_names = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            id_names.put(userIDs[i], names.get(i));
        }
        System.out.println(id_names);
        id_names.remove(456);
        System.out.println(id_names);



    }
}
