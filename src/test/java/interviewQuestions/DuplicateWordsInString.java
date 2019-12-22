package interviewQuestions;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
    // Hey Java is java best language is Java
    // java: 3
    // is: 2
    public static void main(String[] args) {
        findDuplicateWords("Hey Java is ava best language is Java is");

    }

    public static void findDuplicateWords(String inputString){
        //split
        String [] words = inputString.split(" ");

        //create one hashmap:
        Map<String, Integer> wordCount = new HashMap<>();

        //to check each word in given array:
        for(String word: words){
            // if word is present:
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word) + 1);
            }else{
                wordCount.put(word,1);
            }
        }
        System.out.println(wordCount);

        //extracting all the keys of map - wordCount:
        Set<String> wordsInString  = wordCount.keySet();
        System.out.println(wordsInString);

        //loop through all the words in wordCount:
        for(String word: wordsInString){
            if(wordCount.get(word) > 1){
                System.out.println(word + ": " + wordCount.get(word));
            }
        }

    }
}