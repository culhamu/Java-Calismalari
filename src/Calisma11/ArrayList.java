package Calisma11;

public class ArrayList {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip,
         sonucu yazdiran bir method olusturun.
         */
        Integer[][] arr={{2,9,78,3,5},{4,5,8,1},{1,8,6},{8,9,45},{45,8,98}};

        arraysToplam(arr);


    }public static void arraysToplam(Integer[][] arr){

        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                toplam+=arr[i][j];

            }

        }
        System.out.println("MDA toplamı: "+ toplam);

    }
}
