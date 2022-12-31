package Calısma03;

import java.util.Scanner;

public class Ders02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir  tam sayı yazınız");
        int girilenInt= scan.nextInt();
        System.out.println("lütfen bir ondalıklı sayı yazınız");
        double girilenDbl=scan.nextDouble();
        System.out.println(girilenDbl+girilenInt);
    }
}
