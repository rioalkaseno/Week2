
public class Eletronik extends Produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;

    public Eletronik(String nama ,String merek ,double harga, int stok, int garansiTahun) {
        super(nama, harga, stok);
        this.merek = merek;
        this.garansiTahun = garansiTahun;
    }

    @Override
    public void tampilInfo() {
        System.out.println("elektronik");
        super.tampilInfo();
        System.out.println("Masa garansiTahun : " + garansiTahun + " hari");
    }

    public void setgaransiTahun(int garansiTahun) {
        if (garansiTahun < 0) {
            System.out.println("Masa garansiTahun tidak boleh negatif");
            this.garansiTahun = 0;
        } else {
            this.garansiTahun = garansiTahun;
        }
    }

   
    
}
