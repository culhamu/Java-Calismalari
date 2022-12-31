package Calisma16;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        /*
        Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
         */
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(12);
        sayilar.add(30);
        sayilar.add(7);
        sayilar.add(13);
        sayilar.add(10);
        for (int i = 0; i <sayilar.size() ; i++) {

            if (sayilar.get(i)!=7&&sayilar.get(i)!=10){
                sayilar.set(i, sayilar.get(i)+2);
            }

        }
        System.out.println(sayilar);
    }
}
