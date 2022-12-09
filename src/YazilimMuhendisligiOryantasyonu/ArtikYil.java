package YazilimMuhendisligiOryantasyonu;

import java.util.Scanner;
public class ArtikYil
{
    public static void main(String[] args)
    {
        // Değişkenlerin Oluşturulması
        int tarih, mod;

        // Kullanıcıdan Veri Alma
        Scanner input = new Scanner(System.in);
        System.out.print("Tarih Giriniz : ");
        tarih = input.nextInt();

        // Hesaplama
        mod = tarih % 4;

        // Artık Yıl Olup Olmadığının Bulunması ve Çıktı
        if (mod == 0)
        {
            System.out.println(tarih + ", Bir artık yıldır!");
        }
        else
        {
            System.out.println(tarih + ", Bir artık yıl değildir!");
        }
    }
}