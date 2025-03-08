import java.util.Locale;
import java.util.Scanner;

public class zad3 {

    String tekst = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo. Nemo enim ipsam voluptatem, quia voluptas sit, aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos, qui ratione voluptatem sequi nesciunt, neque porro quisquam est, qui dolorem ipsum, quia dolor sit, amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt, ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit, qui in ea voluptate velit esse, quam nihil molestiae consequatur, vel illum, qui dolorem eum fugiat, quo voluptas nulla pariatur?" +
            " At vero eos et accusamus et iusto odio dignissimos ducimus, qui blanditiis praesentium voluptatum deleniti atque corrupti, quos dolores et quas molestias excepturi sint, obcaecati cupiditate non provident, similique sunt in culpa, qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio, cumque nihil impedit, quo minus id, quod maxime placeat, facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet, ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.";
    public zad3() {
        Scanner scan = new Scanner(System.in);
        String [] words = tekst.split(" ");
        System.out.println("Podaj ile wyrazow.");
        int a = scan.nextInt();
        String result = "";
        for(int i = 0; i < a; i ++){
            String newWord = words[(int)(Math.random()* words.length)].toLowerCase();
            if(!(result.isEmpty())) {
                if (result.charAt(result.length()-1) == '.' || result.charAt(result.length()-1) == '?') {
                    String tmp = newWord.substring(0, 1).toUpperCase();
                    newWord = tmp + newWord.substring(1);
                }
            }
            if(!(result.isEmpty())){
                result += " ";
            }
            if(result.isEmpty()){
                String tmp = newWord.substring(0, 1).toUpperCase();
                newWord = tmp + newWord.substring(1);
            }
            result += newWord;
        }
        if (result.charAt(result.length()-1) != '.' || result.charAt(result.length()-1) == '?') {
            result += ".";
        }
        System.out.println(result);
    }

}
