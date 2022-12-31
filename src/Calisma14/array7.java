package Calisma14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array7 {
    public static void main(String[] args) {
        /*
        Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
         */
        Integer[] arr={0,3,4,2,0,9,0};
       Integer[] arrYeni=new Integer[arr.length];
        int ilkIndex=0;
        int sonIndex= arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arrYeni[ilkIndex]=arr[i];
                ilkIndex++;
            }else {
                arrYeni[sonIndex]=0;
                sonIndex--;
            }


        } System.out.println(Arrays.toString(arrYeni));

    }
}
