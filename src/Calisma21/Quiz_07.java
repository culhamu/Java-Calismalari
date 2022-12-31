package Calisma21;

import java.util.Scanner;

public class Quiz_07 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        harf olarak yazdirin, yoksa girilen harfi yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char input=scan.next().charAt(0);
        Character harf=Character.toUpperCase(input);

        System.out.println((input >= 'a' && input <= 'z') ? harf : input);
    }
}
