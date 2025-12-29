public class HesapKarti {
    private String id;
    private String adSoyad;
    private double para;

    public HesapKarti(String id, String adSoyad, double ilkBakiye) {
        this.id = id;
        this.adSoyad = adSoyad;
        this.para = ilkBakiye;
    }

    public String getId() { return id; }
    public String getAdSoyad() { return adSoyad; }
    public double getPara() { return para; }

    public void tutarEkle(double miktar) {
        if (miktar > 0) {
            this.para = this.para + miktar; 
        } else {
            System.out.println("Sistem: Sifirdan kucuk para yatirilamaz!");
        }
    }

    @Override
    public String toString() {
        return "Banka Kartı -> [No: " + id + "] Sahibi: " + adSoyad + " | Bakiye: " + para + " TL";
    }
}