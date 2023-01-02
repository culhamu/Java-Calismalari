package Calisma26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C04_list {
    public static void main(String[] args) {
        /*
        Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        Collections.sort(myList);
       int index=myList.indexOf(13);
        int toplam=0;
        for (int i = 0; i < index; i++) {
        toplam+=myList.get(i);
        }
        System.out.println(toplam);
    }
}
