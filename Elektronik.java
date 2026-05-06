
public class Elektronik extends Produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;

    public Elektronik(String nama ,String merek ,double harga, int stok, int garansiTahun) {
        super(nama, harga, stok);
        this.merek = merek;
        this.garansiTahun = garansiTahun;
    }

    public String getMerek(){
        return merek;
    }

    
    public int getGaransiTahun(){
        return garansiTahun;
    }

    @Override
    public void tampilInfo() {
        System.out.println("|ELEKTRONIK|");
        System.out.println("nama    : "+getNama());
        System.out.println("merek   : "+garansiTahun+ "Tahun");
        System.out.println("Masa garansiTahun : " + garansiTahun + " hari");
        System.out.println("------------------");
    }

    public double hitungDiskon(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli)* PPN;
        }


    public double hitungDiskon(int jumlahBeli, double persenPajak){
        return hitungTotalHarga(jumlahBeli)* (persenPajak / 100);
        }

    public double hitungHargaSetelahPajak(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli)+hitungPajak(jumlahBeli);
    }

        @Override
        public double hitungPajak(double harga){
            return harga * 0.20;
        }

   
    
}
