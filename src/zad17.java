import java.util.ArrayList;
import java.util.List;

public class zad17 {
    public zad17() {
        List<Silnik> silniks = new ArrayList<>();
        List<Rodzaj> silniki = new ArrayList<>();
    }
}

class Silnik{
    String rodzaj = "";
    public Silnik() {
    }
}

class SilnikSpalinowy{
    public SilnikSpalinowy() {
    }
}

class SilnikElektryczny{
    public SilnikElektryczny() {
    }
}
//opcja 2

class Silnik_Spalinowy implements Rodzaj {
    public Silnik_Spalinowy() {
    }
}

class Silnik_Elektryczny implements Rodzaj {

}

interface Rodzaj {

}