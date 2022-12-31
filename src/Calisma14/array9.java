package Calisma14;

import java.util.Arrays;
import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
        konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 2 adet kelime giriniz");
        String kelime1=scan.next();
        String kelime2=scan.next();

        String[] arr1=kelime1.toLowerCase().split("");
        Arrays.sort(arr1);
        
        String[] arr2=kelime2.toLowerCase().split("");
        Arrays.sort(arr2);

      if (arr1.length!=arr2.length){
          System.out.println("kelime anagram değil");
      } else if (kelime1.isEmpty()||kelime2.isEmpty()) {
          System.out.println("kelime anagram değil");
      } else if (Arrays.equals(arr1,arr2)) {
          System.out.println("kelime anagramdır");

      }else System.out.println("kelime anagram değil");


    }
}
