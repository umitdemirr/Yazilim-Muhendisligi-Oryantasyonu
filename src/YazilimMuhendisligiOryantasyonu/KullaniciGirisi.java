package YazilimMuhendisligiOryantasyonu;

import java.util.Scanner;

public class KullaniciGirisi
{
    public static void main(String[] args)
    {
        // Değişkenlerin Oluşturulması
        String userName, password;

        // Kullanıcıdan Veri Alma
        Scanner login = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = login.nextLine();
        System.out.print("Şifreniz : ");
        password = login.nextLine();

        // Kullanıcı Adı ve Şifrenin Doğruluğunu Kontrol Eden Kod Bloğu
        if (userName.equals("umitdemir") && password.equals("225541063"))
        {
            System.out.print("Giriş Başarılı!");
        }
        else
        {
            System.out.print("Hatalı Giriş!\nLütfen Tekrar Deneyiniz");
        }
    }
}