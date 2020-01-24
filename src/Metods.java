import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

class Metods {
    static void charsList(String string, LinkedList<Character> list) {
        for(int i=0;i<string.length();i++){
            if((string.charAt(i) != ' ') && (string.charAt(i) != ',') && !list.contains(string.charAt(i))) {
                list.add(string.charAt(i));
            }
        }
    }


    static void getResults(LinkedList<Character> characters, LinkedList<String> words, String[] wordss) {
        for(int j=0; j<characters.size(); j++){
            System.out.print(characters.get(j)+":");
            for (String word : words) {
                if (word.contains(wordss[j])) {
                    System.out.print(word + ",");
                }
            }
            System.out.print("\b \n");
        }
    }

    static <T> void removeDuplicate(LinkedList<T> list)
    {
        Set<T> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
    }
}
