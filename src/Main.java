import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double bakiye = 1000.0;
        boolean calisiyorMu = true;

        System.out.println("--EKONOMİ BANKASI ATM'sine HOŞGELDİNİZ--");

        while(calisiyorMu){
            System.out.println("\n1. Bakiye görüntüle ");
            System.out.println("2. Para Yatır");
            System.out.println("3. Para Çek");
            System.out.println("4. Çıkış");
            System.out.print("Lütfen Bir İşlem Seçin :");

            int secim = sc.nextInt();

        }
    }
}
