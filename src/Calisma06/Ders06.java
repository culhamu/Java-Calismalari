package Calisma06;

import java.util.Locale;

public class Ders06 {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";
        System.out.println(str.toUpperCase().charAt(19/2));
        System.out.println(str.charAt(str.length()/2));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")).substring(5,10));
    }
}
