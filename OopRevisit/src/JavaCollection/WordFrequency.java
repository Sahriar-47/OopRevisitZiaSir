package JavaCollection;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String text = sc.nextLine().toLowerCase();

        String[] words = text.split("\\w+");
        TreeMap<String, Integer> freqMap = new TreeMap<>();

        for(String word: words){
            if(word.isEmpty()) continue;
            freqMap.put(word, freqMap.getOrDefault(word, 0)+1);
        }

        System.out.println("\nWord Frequencies (sorted alphabetically):");
        for(String key: freqMap.keySet()){
            System.out.println(key+ " : "+freqMap.get(key));
        }
        sc.close();
    }
}
