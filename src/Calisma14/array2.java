package Calisma14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array2 {
    public static void main(String[] args) {
        /*
        Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz
         */
        List<String> list=new ArrayList<>(Arrays.asList("Aemal", "Aonathan", "Mark", "Angel", "Veli"));
        int sayac=0;

        for (String each:list) {

            if (each.startsWith("a")||each.startsWith("A")){
                sayac++;
            }


        }System.out.println(sayac);


    }
}
