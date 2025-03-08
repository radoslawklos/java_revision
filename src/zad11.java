public class zad11 {
    public zad11() {
        for (int i = 0; i < 5; i++) {
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
        for (int i = 0; i < 5; i++) {
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
