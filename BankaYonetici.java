import java.util.ArrayList;

public class BankaYonetici {
    private ArrayList<HesapKarti> liste = new ArrayList<>();

    public void yeniKayit(String n, String isim, double p) {
        HesapKarti yeni = new HesapKarti(n, isim, p);
        liste.add(yeni);
        System.out.println("Tamamdır, " + isim + " adına hesap açıldı.");
    }

    public void paraYükle(String no, double miktar) {
        int bulundu = 0; 
        for (int i = 0; i < liste.size(); i++) {
            HesapKarti gecici = liste.get(i);
            if (gecici.getId().equals(no)) {
                gecici.tutarEkle(miktar); 
                System.out.println("Para yatırıldı. Güncel durum: " + gecici.getPara());
                bulundu = 1;
                break;
            }
        }
        if (bulundu == 0) {
            System.out.println("Hata: " + no + " numaralı bir hesap bulamadık.");
        }
    }

    public void dokumAl() {
        System.out.println("\n--- MEVCUT MÜŞTERİLER ---");
        for (HesapKarti hk : liste) {
            System.out.println(hk.toString());
        }
    }
}