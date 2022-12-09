package YazilimMuhendisligiOryantasyonu;

import java.util.Scanner;
public class HesapMakinesi
{
    public static void main(String[] args)
    {
        // Değişkenlerin Oluşturulması
        int preference;
        double number1, number2, toplama, cikarma, carpma, bolme;

        // Kullanıcıdan Veri Alma
        Scanner select = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        number1 = select.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        number2 = select.nextDouble();

        // Hesaplamaların Yapılması
        toplama = number1 + number2;
        cikarma = number1 - number2;
        carpma = number1 * number2;
        bolme = number1 / number2;

        // Kullanıcıya Yapılacak İşlemi Seçtirme
        System.out.print("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme\n");
        System.out.print("Yukardaki İşlemlerden Birini Seçiniz : ");
        preference = select.nextInt();

        // Seçilen İşleme Göre Verilerin Bilgiye Dönüştürülmesi ve Çıktı
        switch (preference){
            case 1:
                System.out.println("Toplam : " + toplama);
                break;
            case 2:
                System.out.println("Çıkarma : " + cikarma);
                break;
            case 3:
                System.out.println("Çarpma : " + carpma);
                break;
            case 4:
                System.out.println("Bölme : " + bolme);
                break;
            default:
                System.out.println("Lütfen Geçerli Bir Değer Giriniz!");
                break;
        }
    }
}