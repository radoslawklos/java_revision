import java.util.ArrayList;
import java.util.List;

public class zad14 {
    public zad14() {
        //najlepiej uzyc klas i dziecziczenia
        //przyklad ponizej
        List <Device> devices = new ArrayList<>();
        Phone Iphone = new Phone(123, "electricity", "Iphone");
        Computer computer = new Computer(456, "electricity", "HP");
        devices.add(Iphone);
        devices.add(computer);
    }
}
class Device{
    int code;
    String energySource;
    public Device(int code, String energySource) {
        this.code = code;
        this.energySource = energySource;
    }
}

class Phone extends Device{
    String name;
    public Phone(int code, String energySource, String name) {
        super(code, energySource);
        this.name = name;
    }
}

class Computer extends Device{
    String producent;
    public Computer(int code, String energySource, String producent) {
        super(code, energySource);
        this.producent = producent;
    }
}
