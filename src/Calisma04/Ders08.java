package Calisma04;

public class Ders08 {
    public static void main(String[] args) {

        int a=10;
        System.out.println("a nın değeri:"+ ++a);
        int b=a++;
        System.out.println("b nin değeri:"+ b);
        int c=b++ +a;
        System.out.println("c nin değeri:"+ c);
        System.out.println("değerlerin Toplamı:" + (a+b+c));
    }
}
