package YazilimMuhendisligiOryantasyonu;

import java.util.Scanner;
public class Hipotenus
{
    public static void main(String[] args)
    {
        // Değişkenlerin Oluşturulması
        int a,b;
        double c;

        // Kullanıcıdan Değer Alma
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci uzunluğunu giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci uzunluğu giriniz : ");
        b = input.nextInt();

        // Hipotenüsün Yani c Değerinin Hesaplanması
        c = Math.sqrt((a*a) + (b*b));

        // Çıktının Oluşturulması
        System.out.println("Hipotenüs Değeriniz : " + c);

    }
}
