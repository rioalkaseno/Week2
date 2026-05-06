public class Makanan extends Produk {
    private String kadaluwarsa;
    private String kategori;

    
    public Makanan(String nama, double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok);
    }


    @Override
    //abstract & override 
    public void tampilInfo() {
    }

    


 
}
    