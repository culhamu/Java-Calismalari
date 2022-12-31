package Calisma21;

import java.util.Scanner;

public class Quiz_03 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        olup olmadigini yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char input=scan.next().charAt(0);


        if (!(input>='A' && input<='Z')){
            System.out.println("Lütfen büyük harf giriniz");

        }else System.out.println("Tesekkurler");

    }
}
