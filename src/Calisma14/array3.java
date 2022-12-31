package Calisma14;

import java.util.Arrays;

public class array3 {
    public static void main(String[] args) {
        /*
        Verilen bir String'deki sesli harf sayısını bulunuz.
         */
        String str="Java çok güzeldir";
        char[] seslliHarfler={'a','e','i','o','ö','u','ü'};
        int sayac=0;
        for (int i = 0; i < str.length(); i++) {
            char chr=str.charAt(i);
            if (Arrays.asList(seslliHarfler).contains(chr)){
                sayac++;
            }

        }System.out.println(sayac);


    }
}
