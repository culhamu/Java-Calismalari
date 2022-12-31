package Calisma17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru03 {
    public static void main(String[] args) {
        /*
        Soru 41-)
        Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen
        ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}

         */
        int[] Input1={1,2,3,4};
        int[] Input2={5,6};

        cikti(Input1,Input2);

    }public static void cikti(int[] arr1,int[] arr2){

        List<Integer> arrList=new ArrayList<>();

        for (int w:arr1) {
            arrList.add(w);

        }
        for (int w:arr2) {
            arrList.add(w);

        }
        int[] arrToplam=new int[arrList.size()];

        for (int i = 0; i < arrToplam.length; i++) {

            arrToplam[i]=arrList.get(i);

        }

        System.out.println(Arrays.toString(arrToplam));

    }
}
