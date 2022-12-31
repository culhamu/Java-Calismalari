package Calisma04;

import java.util.Scanner;

public class Ders02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char ilkHarf=scan.next().charAt(0);

        System.out.println((char) (ilkHarf+1)+" "+(char) (ilkHarf+2)+" "+(char) (ilkHarf+3));
    }
}
