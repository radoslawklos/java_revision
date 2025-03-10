import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class zad21 {
    public zad21() {
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(new File("test.txt")));
            for (int i = 0; i < 10; i++) {
                String wyraz = newWord();
                bf.write(wyraz);
                bf.newLine();
            }
            bf.close();
        }catch (IOException e){
            System.out.println("There is a problem with the file.");
        }
        System.out.println("Done");

    }

    public String newWord(){
        String res = "";
        for (int i = 0; i < 10; i++) {
            res += (char)('a' + Math.random()*26);
        }
        return res;
    }
}
