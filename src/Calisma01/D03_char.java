package Calisma01;

import java.util.Scanner;

public class D03_char {
    public static void main(String[] args) {

        System.out.println('d'*'t');
        System.out.println((double) '5'/'H');
        System.out.println('G'-98);
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);
        System.out.println((char) (girilenKarakter+2)+","+
                           (char) (girilenKarakter+4)+","+
                           (char) (girilenKarakter+6));
        System.out.println((char) ('f'+32));








    }
}
