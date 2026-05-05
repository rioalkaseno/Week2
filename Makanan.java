public class Makanan extends Produk {
    private int expired;

    public Makanan(String nama, double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok, kategori);
        setExpired(expired);
    }

    public void tampilData() {
        super.tampilInfo();
        System.out.println("Masa expired : " + expired + " hari");
    }

    public void setExpired(int expired) {
        if (expired < 0) {
            System.out.println("Masa expired tidak boleh negatif");
            this.expired = 0;
        } else {
            this.expired = expired;
        }
    }
}

