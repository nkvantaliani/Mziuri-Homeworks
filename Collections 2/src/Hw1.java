import java.util.HashMap;

public class Hw1 {
    public static void main(String[] args) {

       String[] words = {"hello", "hello", "world","java", "word", "hello","world","java"};

        HashMap<String,Integer> wordCount = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println(wordCount);
    }
}
