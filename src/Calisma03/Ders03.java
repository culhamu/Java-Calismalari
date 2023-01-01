package Calisma03;

import java.util.Scanner;

public class Ders03 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Tam Sayı Yazınız");
        int girilenInt= scan.nextInt();
        System.out.println("Lütfen Bir ondalıklı Sayı Yazınız");
        double girilenDbl= scan.nextDouble();
        System.out.println(girilenDbl*girilenInt);
    }
}
