package Calisma15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class list2 {
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
        int toplam=0;
        for (int w:myList) {
            if (w==13){
               break;
            } toplam+=w;
        }
        System.out.println(toplam);
    }
}
