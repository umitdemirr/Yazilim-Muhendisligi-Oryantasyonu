package YazilimMuhendisligiOryantasyonu;

import java.util.Scanner;
public class NotOrtalamasi
{
    public static void main(String[] args)
    {
        // Değişlenlerin Oluşturulması
        int Algoritma, AlgoritmaLab, FizikI, MatI, IngilizceI, EdebiyatI, BilgisayarBilimlerineGiris;

        // Kullanıcıdan Veri Alma
        Scanner notlar = new Scanner(System.in);
        System.out.print("Algoritma Notunu Giriniz : ");
        Algoritma = notlar.nextInt();
        System.out.println("AlgoritmaLab Noltunu Giriniz : ");
        AlgoritmaLab = notlar.nextInt();
        System.out.println("FizikI Notunu Giriniz : ");
        FizikI = notlar.nextInt();
        System.out.println("MatI Notunu Giriniz : ");
        MatI = notlar.nextInt();
        System.out.println("İngilizceI Notunu Giriniz : ");
        IngilizceI = notlar.nextInt();
        System.out.println("EdebiyatI Notunu Giriniz : ");
        EdebiyatI = notlar.nextInt();
        System.out.println("Bilgisayar Bilimlerine Giriş Notunu Giriniz : ");
        BilgisayarBilimlerineGiris = notlar.nextInt();

        // Hesaplamaların Yapılmlası ve Çıktı
        int toplam = (Algoritma + AlgoritmaLab + FizikI + MatI + IngilizceI + EdebiyatI + BilgisayarBilimlerineGiris);
        double sonuc = toplam/7;

        System.out.println(sonuc);
    }
}