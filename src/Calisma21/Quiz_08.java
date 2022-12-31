package Calisma21;

import java.util.Scanner;

public class Quiz_08 {
    public static void main(String[] args) {

        /*
        Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        ve girilen harfin karsiligini yazdirin.
        I : International S : Software T : Testing Q : Qualifications B: Board
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ISTQB öğrenmek istediğiniz harfin anlamını sayı sırasına göre giriniz");
        int ISTQB= scan.nextInt();




        switch (ISTQB){
            case 1:
                System.out.println("I : International");
                break;
            case 2:
                System.out.println("S : Software");
                break;
            case 3:
                System.out.println("T : Testing");
                break;
            case 4:
                System.out.println("Q : Qualifications");
                break;
            case 5:
                System.out.println("B: Board");
                break;
            default:
                System.out.println("Gecersiz karakter");
        }
    }
}
