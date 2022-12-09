package YazilimMuhendisligiOryantasyonu;

import java.util.Scanner;
public class CiftSayiBulma
{
    public static void main(String[] args)
    {
        // Değişkenlerin Tanımlanması
        int i, sayi;

        // Kullanıcıdan Veri Alma
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Değeri Giriniz : ");
        sayi = input.nextInt();

        // 1'den Başlayarak Verilen Sayıya Kadar Sayıların Tek mi Çift mi Olduğunu Kontrol Eden Kod Bloğu
        for (i = 1; i <= sayi; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(i + ", ");
            }
        }
    }
}