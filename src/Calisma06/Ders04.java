package Calisma06;

public class Ders04 {
    public static void main(String[] args) {

        String str1="Hayir";
        String str2="HAyiR";
        String str3="hAyİr";
        String str4="hayir";
        String str5="ha";
        String str6="Yir";
        String str7=str5.concat(str6);

        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str4.equalsIgnoreCase(str7));
    }
}
