package Calisma17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_genelTekrar {
    public static void main(String[] args) {
        /*
        Given a list of strings, write a method that returns a list of all strings that
         start with the letter 'a' (lower case) and have exactly 3 letters.
          TIP: Use Java 8 Lambdas and Streams API's.
         */
        List<String> list=new ArrayList<>(Arrays.asList("ali","veli","hüseyin","alo"));
        System.out.println(kelimeBul(list));

    }public static List<String> kelimeBul( List<String> list){

        List<String> kelimeList=new ArrayList<>();
        for (String w:list) {
            if (w.startsWith("a")){
                if (w.length()<=3){

                    kelimeList.add(w);
                }

            }

        }



        return kelimeList;
    }
}
