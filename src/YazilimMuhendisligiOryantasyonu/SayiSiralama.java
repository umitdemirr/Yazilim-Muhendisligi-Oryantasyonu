package YazilimMuhendisligiOryantasyonu;

import java.util.Scanner;
public class SayiSiralama
{
    public static void main(String[] args)
    {
        // Değişkenlerin Oluşturulması
        double a, b, c;

        // Kullanıcıdan Veri Alma
        Scanner siralama = new Scanner(System.in);
        System.out.print("a Sayısını Giriniz : ");
        a = siralama.nextDouble();
        System.out.print("b Sayısını Giriniz : ");
        b = siralama.nextDouble();
        System.out.print("c Sayısını Giriniz : ");
        c = siralama.nextDouble();

        System.out.println("a Sayısı : " + a);
        System.out.println("b Sayısı : " + b);
        System.out.println("c Sayısı : " + c);

        // a Sayısının En Küçük Olduğu Durumda Çalışacak Kod Bloğu
        if ((a<b) && (a<c))
        {
            // b'nin c'den Küçük Olduğu Durumda Çalışacak Kod Bloğu
            if (b<c)
            {
                System.out.print("Sıralama Bu Şekildedir : a < b < c");
            }
            // c'nin b'den Küçük Olduğu Durumda Çalışacak Kod Bloğu
            else
            {
                System.out.println("Sıralamanız : a < c < b");
            }
        }


        // b Sayısının En Küçük Olduğu Durumda Çalışacak Kod Bloğu
        else if ((b<a) && (b<c))
        {
            // a'nin c'den Küçük Olduğu Durumda Çalışacak Kod Bloğu
            if (a<c)
            {
                System.out.println("Sıralama Bu Şekildedir : b < a < c");
            }
            // c'nin a'dan Küçük Olduğu Durumda Çalışacak Kod Bloğu
            else
            {
                System.out.println("Sıralama Bu Şekildedir : b < c < a");
            }
        }


        // c Sayısının En Küçük Olduğu Durumda Çalışacak Kod Bloğu
        else
        {
            // b'nin a'dan Küçük Olduğu Durumda Çalışacak Kod Bloğu
            if (b<a)
            {
                System.out.println("Sıralama Bu Şekildedir : c < b < a");
            }
            // a'nın b'den Küçük Olduğu Durumda Çalışacak Kod Bloğu
            else
            {
                System.out.println("Sıralama Bu Şekildedir : c < a < b");
            }
        }
    }
}