package Calisma10;

public class Arrays6 {
    public static void main(String[] args) {
        /*
        Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        olusturun.
         */
        String[] words = {"hello", "world", "welcome", "to", "java"};
        findLongestAndShortestWords(words);


    }public static void findLongestAndShortestWords(String[] words) {
        String longestWord = words[0];
        String shortestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        System.out.println("En uzun kelime: " + longestWord);
        System.out.println("En kısa kelime: " + shortestWord);
    }

}