package Calisma13;

public class soru2 {
    public static void main(String[] args) {
        /*
        Soru29-)
        1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
        İpucu: Loop kulanabilirsiniz
         */
        int toplam=0;
        for (int i = 0; i < 100; i++) {
            toplam+=i;
        }
        System.out.println(toplam);
    }
}
