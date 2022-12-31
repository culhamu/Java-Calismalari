package Calisma15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list3 {
    public static void main(String[] args) {
        /*
        Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
         */
        List<Integer> sayilar=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int carpim=1;
        for (Integer w:sayilar) {
            if (w%2==0){
                carpim*=w;
            }

        }
        System.out.println(carpim);
    }
}
