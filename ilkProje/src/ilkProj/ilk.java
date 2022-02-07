package ilkProj;
import java.util.Scanner;
public class ilk {
    public static void main(String[] args) {

        // değişkenleri oluşturalım,
        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfımızı tanımladık

        Scanner inp= new Scanner(System.in);

        // Kullanıcıdan değerleri al


        System.out.print("Matematik notunuz : ");
        mat= inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik= inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya= inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce= inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih= inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik= inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);

        double sonuc = (double)toplam/6;

        System.out.println("Ortalamanız : " + sonuc);

        boolean sinifGecme = sonuc>=60;

        String sinifGecmeSonucu = sinifGecme ? "TEBRİKLER Sınıfı Geçtiniz" : "MAALESEF Sınıfta Kaldınız";

        System.out.println(sinifGecmeSonucu);


    }


}
