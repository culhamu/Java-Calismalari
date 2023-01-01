package Calisma01;

import java.util.Scanner;

public class D01_wrapperMatematikselIslemler {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str="Java";
        System.out.println(str.toUpperCase());
        double dbl=23.5;
        int sayi=(int)dbl;
        System.out.println(sayi);
        byte byt=(byte) sayi;
        System.out.println(sayi);
        sayi=1309;
        byt =(byte) sayi;
        System.out.println(+byt);
    }
}
