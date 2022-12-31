package Calisma05;

import java.util.Scanner;

public class Ders04 {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int a= scan.nextInt();

        System.out.println("Lütfen bir tamsayı giriniz");
        int b= scan.nextInt();

        System.out.println(a > b ? b : a );
    }
}
