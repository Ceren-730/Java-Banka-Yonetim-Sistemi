import java.util.Scanner;

public class BankaUygulamasi {
    public static void main(String[] args) {
        BankaYonetici yonetim = new BankaYonetici();
        Scanner sc = new Scanner(System.in);

        System.out.println("Banka Sistemine Hosgeldiniz...");

        while (true) {
            System.out.println("\nSecenekler: 1-Hesap Ac, 2-Para Yatir, 3-Listele, 0-Cikis");
            System.out.print("Seciminiz nedir: ");
            String girdi = sc.nextLine();

            if (girdi.equals("1")) {
                System.out.print("Hesap No: "); String no = sc.nextLine();
                System.out.print("Musteri Ad Soyad: "); String ad = sc.nextLine();
                System.out.print("Acilis Bakiyesi: "); 
                double b = Double.parseDouble(sc.nextLine());
                yonetim.yeniKayit(no, ad, b);
            } 
            else if (girdi.equals("2")) {
                System.out.print("Hesap No Gir: "); String no = sc.nextLine();
                System.out.print("Yatacak Tutar: "); 
                double m = Double.parseDouble(sc.nextLine());
                yonetim.paraYükle(no, m);
            } 
            else if (girdi.equals("3")) {
                yonetim.dokumAl();
            } 
            else if (girdi.equals("0")) {
                System.out.println("Sistemden cikis yapiliyor... Iyi gunler.");
                break;
            } 
            else {
                System.out.println("Hatali bir tusa bastiniz!");
            }
        }
    }
}