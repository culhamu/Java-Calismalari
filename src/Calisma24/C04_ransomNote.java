package Calisma24;

import java.util.ArrayList;
import java.util.List;

public class C04_ransomNote {
    public static void main(String[] args) {
        /*
        Given two strings ransomNote and magazine,
         return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
        Each letter in magazine can only be used once in ransomNote.
         */
       String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));

    } public static boolean canConstruct(String ransomNote, String magazine){
        List<Character> magazineChar=new ArrayList<>();
        for (char w:magazine.toCharArray()) {
            magazineChar.add(w);

        }
        for (char w:ransomNote.toCharArray()) {
            if (!magazineChar.contains(w)){
                return false;
            }

            magazineChar.remove(magazineChar.indexOf(w));
        }return true;
    }
}
