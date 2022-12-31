package Calisma10;

public class Arrays2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        method yaziniz.
         */
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(arrToplama(numbers));

    }public static int arrToplama(int[] arr){
        int toplam=0;
        for (int each:arr) {
            toplam+=each;

        }
        return toplam;
    }
}
