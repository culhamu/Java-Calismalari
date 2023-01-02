package Calisma25;

import java.awt.*;
import java.util.Scanner;

public class C03_Constructor {

        /*
        Constructor Sorusu-
1. Aşama: Başlangıçta İlk Oyuncuya oyunu başlatmak için bir kelime girmesini iste.
2. Aşama: Sonra oyuncuyu degiştir ve ikinci oyuncuya geç. Yeni oyuncuya verilen kelimenin geçerli olup olmadıgını sor
   2.1) Eğer yeni oyuncu verilen kelimeyi kabul ederse : kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin ve 3. adıma gidin
  2.2) Eğer yeni oyuncu verilen kelimeyi	geçerli olarak kabul etmesse "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin.
3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer devam etmek isterlerse:
  3.1) Kullanıcıdan kelimeye eklemek için bir harf isteyin
  3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya Sona)
  3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin Eğer devam etmek istemezlerse: "Game Finished" yazdırın.

Puanları ve kazananı ekrana yazdırın
         */


        private String kelime;
        private int oyuncu1Puan;
        private int oyuncu2Puan;

        public C03_Constructor() {
            this.kelime = "";
            this.oyuncu1Puan = 0;
            this.oyuncu2Puan = 0;
        }

        public void play() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Oyuncu 1, Lütfen bir kelime giriniz :");
            kelime = scanner.nextLine();
            System.out.println("Oyuncu 2, girilen " + kelime + " yi onaylıyor musun (e/h)");
            String cevap = scanner.nextLine();
            if (cevap.equalsIgnoreCase("h")) {
                System.out.println("Geçersiz kelime, oyunu 1. oyuncu kazandı");
                oyuncu1Puan += kelime.length();
                return;
            }
           oyuncu1Puan += kelime.length();
            while (true) {
                System.out.println("oyuna devam etmek istiyor musun? (e/h)");
                cevap = scanner.nextLine();
                if (!cevap.equalsIgnoreCase("e")) {
                    break;
                }
                int suankiOyuncu = (oyuncu1Puan> oyuncu2Puan) ? 2 : 1;
                System.out.println("oyuncu " + suankiOyuncu + ", eklemek için bir harf girin :");
                char harf = scanner.nextLine().charAt(0);
                System.out.println("Nereye eklemek istiyorsun ? (b/s)");
                String konumu = scanner.nextLine();

                if (konumu.equalsIgnoreCase("b")) {
                    kelime = harf + kelime;
                } else {
                    kelime = kelime + harf;
                }
                if (suankiOyuncu == 1) {
                    oyuncu1Puan += 1;
                } else {
                    oyuncu2Puan += 1;
                }
            }

            System.out.println("Game finished.");
            System.out.println("1. oyuncu puanı : " + oyuncu1Puan);
            System.out.println("2. oyuncu puanı : " + oyuncu2Puan);
            if (oyuncu1Puan > oyuncu2Puan) {
                System.out.println("Oyuncu 1 kazandı !");
            } else if (oyuncu2Puan > oyuncu1Puan) {
                System.out.println("Oyuncu 2 kazandı !");
            } else {
                System.out.println("Berabere!");
            }
        }



        public static void main(String[] args) {
           C03_Constructor game = new C03_Constructor();
            game.play();
        }






}
