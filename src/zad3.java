public class zad3 {
    public zad3() {
        int n = 10;
        String tekst = "";
        for (int i = 0; i < n; i++) {
            char character = getChar();
            tekst += character;
        }
        System.out.println(tekst);
    }

    public char getChar(){
        char character = (char) ('a' + (int)(Math.random()*26));
        if (character == 'w' || character == 'j' || character == 'z' || character == 'k'){
            getChar();
        }
        return character;
    }
}
