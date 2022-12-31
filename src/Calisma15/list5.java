package Calisma15;

import java.util.ArrayList;
import java.util.List;

public class list5 {
    public static void main(String[] args) {
        /*
        Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
         */
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add(15);
        sayilar.add(19);
        sayilar.add(15);
        sayilar.add(170);

        System.out.println(sayilar);

        for (int w:sayilar) {

            if (sayilar.contains(15)){
                int index=sayilar.indexOf(15);
                sayilar.set(index,51);
            }
        }
        System.out.println(sayilar);

    }
}
