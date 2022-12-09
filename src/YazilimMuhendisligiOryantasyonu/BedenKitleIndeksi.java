package YazilimMuhendisligiOryantasyonu;

import java.util.Scanner;
public class BedenKitleIndeksi
{
    public static void main(String[] args)
    {
        // Değişkenlerin Oluşturulması
        double kilo, boy, bedenKitleIndeksi;

        // Kullanıcıdan Veri Alma
        Scanner bkiHesaplama = new Scanner(System.in);
        System.out.print("Boyunuz : ");
        boy = bkiHesaplama.nextDouble();
        System.out.print("Kilonuz : ");
        kilo = bkiHesaplama.nextDouble();

        // Beden Kitle İndeksinin Hesaplanması
        bedenKitleIndeksi = kilo / ( boy * boy );

        // Çıktının Oluşturulması
        System.out.println("Vücut Kitle İndeksiniz : " + bedenKitleIndeksi);
    }
}