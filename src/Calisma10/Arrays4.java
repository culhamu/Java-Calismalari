package Calisma10;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        kullanildigini yazdiran bir method olusturun.
         */

        String  arr="Java candir,selenium heyecan";
        String arananHarf="i";
          arananiHarfiBul(arr,arananHarf);

    }public static void arananiHarfiBul(String arr,String arananHarf){


        int sayac=0;
        String [] arrOfStr=arr.split("");
        for (int i = 0; i < arrOfStr.length; i++) {
            if (arrOfStr[i].contains(arananHarf)){

                sayac++;
            }

        }if (sayac==0){
            System.out.println("Aranan harf array'de yok");
        }else
        System.out.println("verilen array de aranan harf "+sayac+" tane bulunmaktadır");

    }
}
