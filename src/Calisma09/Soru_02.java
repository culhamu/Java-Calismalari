package Calisma09;

import java.util.Scanner;

public class Soru_02 {
    public static void main(String[] args) {
        /*
        Soru 19-)
        Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
        ipucu:
        Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen doğduğunuz ayı yazınız  ");
        String ay = scan.next().toLowerCase();
        System.out.println("Lütfen doğum gününüzü pozitif tam sayı olarak giriniz");
        int gun = scan.nextInt();
        burcOgrenme(ay,gun);


    }public static void burcOgrenme(String ay,int gun){

        switch (ay){
            case "ocak" : if(gun>21) System.out.println("Kova");
                          else System.out.println("Oğlak");
                          break;
            case "şubat" : if (gun>19) System.out.println("Balık");
                           else System.out.println("Kova");
                           break;
            case "mart" : if (gun>20) System.out.println("Koç");
                          else System.out.println("Balık");
                          break;
            case "nisan" : if (gun>20) System.out.println("Boğa");
                           else System.out.println( "Koç");
                           break;
            case "mayıs" : if (gun>21) System.out.println("İkizler");
                           else System.out.println("Boğa");
                           break;
            case "haziran" : if (gun>22) System.out.println("Yengeç");
                             else System.out.println("İkizler");
                             break;
            case "temmuz" : if (gun>22) System.out.println("Aslan");
                            else System.out.println("Yengeç");
                            break;
            case "ağustos" : if (gun>22) System.out.println("Başak");
                             else System.out.println("Aslan");
                             break;
            case "eylül" : if (gun>22) System.out.println("Terazi");
                           else System.out.println("Başak");
                           break;
            case "ekim" : if (gun>22) System.out.println("Akrep");
                          else System.out.println( "Terazi");
                          break;
            case "kasım" : if (gun>21) System.out.println("Yay");
                            else System.out.println("Akrep");
                            break;
            case "aralık" : if (gun>21) System.out.println("Oğlak");
                            else System.out.println("Yay");
                             break;
            default:
                System.out.println("Yanlış değer girdiniz");


        }


    }
}
