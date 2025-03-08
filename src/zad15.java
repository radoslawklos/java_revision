import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class zad15 {
    public zad15() {
        Plane p1 = new Plane(12, "coal");
        Bird b1 = new Bird("Stork", 4);

        List<Fly> objects = new ArrayList<>();
        objects.add(p1);
        objects.add(b1);

        for (int i = 0; i < objects.size(); i++) {
            objects.get(i).fly();
        }
    }
}

interface Fly{
    void fly();
}

class Plane implements Fly{
    int idnum;
    String fuel;
    public Plane(int id, String fuel) {
        this.idnum = id;
        this.fuel = fuel;
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}

class Bird implements Fly{
    String species;
    int age;
    public Bird(String species, int age) {
        this.species = species;
        this.age = age;
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
