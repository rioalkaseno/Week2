public class Makanan extends Produk {
    private int expired;

    
    public Makanan(String nama, double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok, kategori);
        this.expired = expired;
    }


    @Override
    public void tampilInfo() {
        System.out.println("Makanan");
        super.tampilInfo();
        System.out.println("Masa expired : " + expired + " hari");
    }

    public void setExpired(int expired, String type) {

        if (type.equals("Nasi")) {
             if (expired < 4) {
            System.out.println("Masa expired tidak boleh negatif");
        } else {
            this.expired = expired; }}
             if (expired < 2) {
            System.out.println("Masa expired tidak boleh negatif");
        } else {
            this.expired = expired;
        }
    }
}
    