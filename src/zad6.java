import java.util.ArrayList;
import java.util.List;

public class zad6 {
    public zad6() {
        Ang p1 = new Ang(0,0, 0);
        Ang p2 = new Ang(4,0, 0);
        Ang p3 = new Ang(0,0, 4);
        Ang p4 = new Ang(4,0, 4);
        Ang p5 = new Ang(0,8, 0);
        Ang p6 = new Ang(4,8, 0);
        Ang p7 = new Ang(0,8, 4);
        Ang p8 = new Ang(4,8, 4);

        Side pod1 = new Side(p1, p2, p3, p4);
        Side pod2 = new Side(p5, p6, p7, p8);
        Gs g1 = new Gs(pod1, pod2);
        System.out.println(g1);
    }
}

class Gs{
    List<Side> podstawy = new ArrayList<>();
    public Gs(Side ... sides) {
        for (Side side : sides) {
            podstawy.add(side);
        }
    }

    @Override
    public String toString() {
        return "Gs{" +
                "podstawy=" + podstawy +
                '}';
    }
}

class Ang{
    List <Double> xyz = new ArrayList<>();
    public Ang(double x, double y, double z) {
        xyz.add(x);
        xyz.add(y);
        xyz.add(z);
    }

    @Override
    public String toString() {
        return "Ang{" +
                "xyz=" + xyz +
                '}';
    }
}

class Side{
    List <Ang> angles = new ArrayList<>();
    public Side(Ang ... katy) {
        for(Ang kat : katy){
            angles.add(kat);
        }
    }

    @Override
    public String toString() {
        return "Side{" +
                "angles=" + angles +
                '}';
    }
}
