package Calisma26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_list {
    public static void main(String[] args) {
        /*
        Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
         */
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int carpim=1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0){
                carpim*=list.get(i);
            }

        }
        System.out.println(carpim);
    }
}
