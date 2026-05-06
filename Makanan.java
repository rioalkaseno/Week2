public class Makanan extends Produk {
    private String kadaluwarsa;
    private String kategori;

    
    public Makanan(String nama, double harga, int stok, String kadaluwarsa, String kategori) {
        super(nama, harga, stok);
        this.kadaluwarsa=kadaluwarsa;
        this.kategori=kategori;
    }


    @Override
    //abstract & override 
    public void tampilInfo() {

    }

 
}
    