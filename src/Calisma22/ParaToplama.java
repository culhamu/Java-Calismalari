package Calisma22;

public class ParaToplama {
    public static void main(String[] args) {
        /*
        Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        input1 : “15.30 €” , input2 : “11.40 €”
        output : 36.70 €
         */
        String input1="15.30 €";
        String input2="11.40 €";
        char parabirimi=input1.charAt(input1.length()-1);

        input1=input1.replace("€","");
        input2=input2.replace("€","");

        double fiyatString=Double.parseDouble(input1);


        double fiyat2String=Double.parseDouble(input2);



        double yenifiyat=(fiyatString+fiyat2String);

        System.out.println(yenifiyat+" "+parabirimi);



    }
}
