package Calisma14;

public class array4 {
    public static void main(String[] args) {
        /*
        İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
         */

        String[] arr={ "Kemal", "Jonathan", "Mark", "angela", "Veli" };
        int count=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].charAt(0)==arr[i].charAt(arr[i].length()-1)){
                count++;
            }

        } System.out.println(count);
    }
}
