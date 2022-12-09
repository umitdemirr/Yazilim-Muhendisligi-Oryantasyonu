package YazilimMuhendisligiOryantasyonu;

import java.util.Scanner;
public class DaireCevresiHesaplama
{
    public static void main(String[] args)
    {
        // Değişkenlerin Belirlenmesi
        int yariCap, alan, cevre, pi = 3;

        // Kullanıcıdan Veri Alma
        Scanner daireCevreHesaplama = new Scanner(System.in);
        System.out.print("Lütfen yarıçap bilgisini giriniz : ");
        yariCap = daireCevreHesaplama.nextInt();

        // Alan ve Çevre Hesaplaması
        alan = pi * yariCap * yariCap;
        cevre = 2 * pi * yariCap;

        // Çıktının Oluşturulması
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
    }
}