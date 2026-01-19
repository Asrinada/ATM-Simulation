import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bakiye = 1000.0;
        boolean calisiyorMu = true;

        System.out.println("--EKONOMİ BANKASI ATM'sine HOŞGELDİNİZ--");

        while (calisiyorMu) {
            System.out.println("\n1. Bakiye görüntüle ");
            System.out.println("2. Para Yatır");
            System.out.println("3. Para Çek");
            System.out.println("4. Çıkış");
            System.out.print("Lütfen Bir İşlem Seçin :");

            int secim = sc.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Mevcut Bakiyeniz: " + bakiye + " TL");
                    break;

                case 2:
                    System.out.println("Yatırmak İstediğiniz Tutarı Giriniz : ");
                    double yatirilan = sc.nextDouble();

                    bakiye += yatirilan;
                    System.out.println("Yeni Bakiyeniz : " + bakiye + " TL");
                    break;

                case 3:
                    System.out.println("Çekilmek İstenen Tutarı Giriniz : ");
                    double cekilen = sc.nextDouble();

                    if(cekilen > bakiye) {
                        System.out.println("Hata : Yetersiz Bakiye !");
                    } else {
                        bakiye -= cekilen;
                        System.out.println("Para Çekildi. Yeni Bakiyeniz : " + bakiye + " TL");
                    }
                    break;

                case 4 :
                    System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkürler");
                    calisiyorMu = false;

                    break;

                default:
                    System.out.println("Geçersiz Seçim! Lütfen 1-4 Arasında Bir Sayı Giriniz ");
            }
        }
    }
}