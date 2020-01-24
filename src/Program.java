
import java.util.*;


public class Program {

    public static void main(String[] args) {

        String string = "ala ma kota, kot koduje w Javie Kota";
        //Scanner scanner=new Scanner(System.in);
       // String string = scanner.nextLine();
        String stringLow = string.toLowerCase();
        LinkedList<Character> characters = new LinkedList<>();
        String[] seperatWords = stringLow.split("[, .!?]");
        LinkedList<String> words = new LinkedList<>(Arrays.asList(seperatWords));

        Metods.charsList(stringLow,characters);

        Collections.sort(characters);

        Collections.sort(words);

        Metods.removeDuplicate(words);

        String[] wordss= new String[characters.size()];

        for(int h=0; h<characters.size();h++){
            wordss[h]=characters.get(h).toString();
        }

        Metods.getResults(characters, words, wordss );
    }

}

