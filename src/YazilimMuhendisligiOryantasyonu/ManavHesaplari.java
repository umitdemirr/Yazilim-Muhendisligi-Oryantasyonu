package YazilimMuhendisligiOryantasyonu;

import java.util.Scanner;
public class ManavHesaplari
{
    public static void main(String[] args)
    {
        // Değişkenlerin Oluşturulması
        double Armut, Elma, Domates, Muz, Patlican, odenecekTutar;

        // Müşteriden Verinin Alınması
        Scanner manavHesaplari= new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        Armut = manavHesaplari.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        Elma = manavHesaplari.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        Domates = manavHesaplari.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        Muz = manavHesaplari.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        Patlican = manavHesaplari.nextDouble();

        // Kilogram Fiyatıyla Kilogramın Çarpılmasıyla Fiyatın Oluşturulması
        Armut = Armut * 2.14;
        Elma = Elma * 3.67;
        Domates = Domates * 1.11;
        Muz = Muz * 0.95;
        Patlican = Patlican * 5;

        // Ödenecek Tutarın Hesaplanması ve Çıktı
        odenecekTutar = Armut + Elma + Domates + Muz + Patlican;
        System.out.println("Ödenecek Tutar : " + odenecekTutar);
    }
}
