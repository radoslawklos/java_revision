public class zad2 {
    public zad2() {
        int n = 10;
        String tekst = "";
        for (int i = 0; i < n; i++) {
            char character = (char) ('a' + (int)(Math.random()*26));
            tekst += character;
        }
        System.out.println(tekst);
    }
}
