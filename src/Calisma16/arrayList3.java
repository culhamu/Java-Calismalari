package Calisma16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayList3 {
    public static void main(String[] args) {
        /*
        Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70
         */
        List<String> list = new ArrayList<>(Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45"));

        Collections.sort(list);

        Double toplam=0.0;

        for (int i = 0; i < list.size(); i++) {

            Double fiyat=Double.valueOf(list.get(i).replace("$",""));
            




        }

    }
}
