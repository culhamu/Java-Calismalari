package Calisma12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
         */
        int[] sayi1={1,2,3,5,1,31,5,1,2,51,3,2,5,84,1,3};

        ortakElemanlar(sayi1);

    }public static void ortakElemanlar(int[] sayi1){
        ArrayList<Integer> ortlist=new ArrayList<>();

        for (int i = 0; i < sayi1.length; i++) {


                if (!ortlist.contains(sayi1[i])){
                    ortlist.add(sayi1[i]);

                }

            }
        System.out.println(ortlist);
        }

}
