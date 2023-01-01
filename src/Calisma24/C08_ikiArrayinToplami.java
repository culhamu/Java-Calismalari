package Calisma24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_ikiArrayinToplami {
    public static void main(String[] args) {
        /*
        You are given two non-empty linked lists representing two non-negative integers.
         The digits are stored in reverse order, and each of their nodes contains a single digit.
         Add the two numbers and return the sum as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]
         */
        int[] l1 = {9,9,9,9,9,9,9},l2 = {9,9,9,9};

        String str1= Arrays.toString(l1),str2=Arrays.toString(l2);
        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        Integer sayi1=Integer.valueOf(str1);
        Integer sayi2=Integer.valueOf(str2);

        Integer toplam=sayi1+sayi2;
        String yeni=String.valueOf(toplam);

        List<Character> list=new ArrayList<>();
        for (int i =yeni.length()-1; i>=0; i--) {

            list.add(yeni.charAt(i));
        }
        System.out.println(list);





    }
}
