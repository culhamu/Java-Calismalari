package Calisma15;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class list6 {
    public static void main(String[] args) {
        /*
        Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
         */
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(31);
        sayilar.add(15);
        sayilar.add(13);
        sayilar.add(54);
        System.out.println(sayilar);

        for (int i = 0; i <sayilar.size() ; i++) {

            if (!sayilar.contains(13)&&sayilar.contains(15)){

                System.out.println("Liste de 13 ve 15 bulunmamaktadır");


            } else  {
                if (sayilar.get(i)==13){
                int index1=sayilar.indexOf(13);
                sayilar.remove(index1);
                i--;
            }
                if (sayilar.get(i)==15){
                    int index2= sayilar.indexOf(15);
                    sayilar.remove(index2);
                    i--;
                }

            }

        }System.out.println(sayilar);

    }
}
