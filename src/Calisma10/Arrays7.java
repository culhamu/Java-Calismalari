package Calisma10;


import java.util.ArrayList;
import java.util.Arrays;

public class Arrays7 {
    public static void main(String[] args) {
        /*
        Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        eski array’e yeni degeri atayin.
         */
        String[] str={"ali","veli","ismet"};
        String eleman="hurşit";
        System.out.println(Arrays.toString(elementEkleme(str, eleman)));

    }public static String[] elementEkleme(String[] arr,String element){

        String[] yeniArray= Arrays.copyOf(arr,arr.length+1);
        yeniArray[yeniArray.length-1]=element;
        arr=yeniArray;
        return arr;
    }
}
