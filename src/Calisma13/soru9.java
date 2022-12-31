package Calisma13;

import java.util.ArrayList;
import java.util.List;

public class soru9 {
    public static void main(String[] args) {
        /*
        Soru 35-)
        Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi
         olarak yazdıran bir method Return edin.
		--> toCharArray() yöntemini kullanmayın
        Örnek:
		String isim:    Yakup
		char arr[]:     [Y,a,k,u,p]
        İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin.
        Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin

         */
        System.out.println(stringiArrayaCevirme("ali"));

    }public static String stringiArrayaCevirme(String isim){
       String[] isimArr=isim.split("");
        List<String> List=new ArrayList<>();

        for (int i = 0; i < isimArr.length; i++) {

            List.add(isimArr[i]);

        }return List.toString();
    }
}
