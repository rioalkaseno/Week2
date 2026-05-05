
public class Eletronik extends Produk {

    private int garansi;

    public Eletronik(String nama, double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok, kategori);
        this.garansi = garansi;
    }

    @Override
    public void tampilInfo() {
        System.out.println("elektronik");
        super.tampilInfo();
        System.out.println("Masa garansi : " + garansi + " hari");
    }

    public void setGaransi(int garansi) {
        if (garansi < 0) {
            System.out.println("Masa garansi tidak boleh negatif");
            this.garansi = 0;
        } else {
            this.garansi = garansi;
        }
    }
}
