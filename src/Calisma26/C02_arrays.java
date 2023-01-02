package Calisma26;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
        konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.
         */
        String str1="Mary",str2="army";
        String[] arr1=str1.toLowerCase().split("");
        String[] arr2=str2.toLowerCase().split("");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        if (Arrays.equals(arr1,arr2)){
            System.out.println("Girilen kelimeler anagramdır");
        }else System.out.println("Girilen kelimeler anagram değildir");

    }
}
