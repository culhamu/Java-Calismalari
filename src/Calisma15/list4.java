package Calisma15;

import java.util.*;

public class list4 {
    public static void main(String[] args) {
        /*
        Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
        Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
        (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
         */
        List<String> renkler=new ArrayList<>();
        renkler.add("Sarı");
        renkler.add("Kırmızı");
        renkler.add("Yeşil");
        renkler.add("Kahverengi");
        renkler.add("Mor");
        Collections.sort(renkler);
        boolean sonuc=true;

        for (int i = 0; i < renkler.size(); i++) {
                String element1=renkler.get(i);
                String element2= renkler.get(i+1);

            if (element1.length()>element2.length()){
                break;
            }else sonuc=false;

        }
        System.out.println("verilen List azalan sırada "+sonuc);

    }
}
