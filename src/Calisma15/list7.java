package Calisma15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list7 {
    public static void main(String[] args) {
        /*
        Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür
         */
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(12);
        sayilar.add(31);
        sayilar.add(15);
        sayilar.add(13);
        sayilar.add(54);

        Collections.sort(sayilar);
        int sayi1=0, sayi2=0;
        int enKucukFark=Integer.MAX_VALUE;

        for (int i =0 ; i<sayilar.size()-1 ; i++) {

          int  aradakiFark=sayilar.get(i+1)- sayilar.get(i);

            if (aradakiFark<enKucukFark){

                enKucukFark=aradakiFark;
                sayi1=sayilar.get(i);
                sayi2=sayilar.get(i+1);

            }
        }
        System.out.println("En yakın iki sayı : "+sayi1+" ve "+sayi2);


    }
}
