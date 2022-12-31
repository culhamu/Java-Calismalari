package Calisma24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C03_palindrome {
    public static void main(String[] args) {

        String str="Ey edip Adanada pide ye";
        str=str.toLowerCase();
        String [] arr=str.split("");
        str=Arrays.toString(arr);


        List<String> list=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.reverse(list);

        String tersStr=list.toString();


       if (str.equals(tersStr)){ System.out.println("ifade polindrome ifadedir");
       }else System.out.println("ifade polindrome değildir");
    }
}
