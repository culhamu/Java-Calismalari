package Calisma25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C04_ {
    public static void main(String[] args) {
        /*
        * Problem Tanımı :
  Basit 4 işlem yapan bir hesap makinesi kodlayınız.

  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen işlem yapacağınız iki adet sayı giriniz");
        double sayi1=sc.nextInt(),sayi2=sc.nextDouble();
        List<Character> dortIslem=new ArrayList<>(Arrays.asList('+','-','*','/'));
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : "+dortIslem);
        char islem=sc.next().charAt(0);
        switch (islem){
            case '+':
                System.out.println(sayi1+sayi2);break;
            case '-':
                if (sayi1>sayi2){
                    System.out.println(sayi1-sayi2);
                }else System.out.println(sayi2-sayi1);break;
            case '*':
                System.out.println(sayi1*sayi2);break;
            case '/':
                if (sayi1>sayi2){
                    System.out.println(sayi1/sayi2);
                }else System.out.println(sayi2/sayi1);break;

            default:
                System.out.println("Geçersiz işlem");
        }
    }
}
