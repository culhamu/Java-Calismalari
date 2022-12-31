package Calisma06;

import java.util.Locale;

public class Ders02 {
    public static void main(String[] args) {

        String str="JAVA CANDIR";
        str=str.toLowerCase(Locale.forLanguageTag("Tr"));

        System.out.println(str);

        str="sevgi insanı hayata bağlar";
        str=str.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);


    }
}
