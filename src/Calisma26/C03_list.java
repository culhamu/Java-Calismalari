package Calisma26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_list {
    public static void main(String[] args) {
        /*
        Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
         */
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);
        int toplam=0;
        for (int w:list) {
            toplam+=w;

        }
        System.out.println(toplam);

    }
}
