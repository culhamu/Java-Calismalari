package Calisma24;

import java.util.ArrayList;
import java.util.List;

public class C01_BinaryTree {
    public static void main(String[] args) {
        /*
       Write a method that checks if there is at least on pair of numbers which sum equals target.
        arr=[1, 3, 4] and target=5 result is true because the pair (1,4) sums to five.
         */
        int[] arr= {1, 3, 4};
        System.out.println(toplamHedefKontrol(arr, 6));


    }public static boolean toplamHedefKontrol(int[] arr,int hedef){

        List<Integer> list=new ArrayList<>();

        for (int w:arr) {

            list.add(w);

        }
        for (int w:arr) {
            if (list.contains(hedef-w))
            return true;
        }



        return false;
    }

}
