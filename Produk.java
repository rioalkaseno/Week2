//package base; // di dalam folder base


abstract public class Produk {
    private String nama; //hanya bisa diakses di dalam class Produk
    String kategori; // hanya bisa diakses dalam package yang sama (default/package-private)
    private double harga; //tidak bisa diakses subclass karena private
    private int stok; //tidak bisa diakses dari mana saja karena private

    public Produk(String nama, double harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }  

    public String getNama(){
        return nama;
    }
    public double getHarga(){
        return harga;
    }
    public int getStok(){
        return stok;
    }


    public void setHarga(double harga){
        this.harga = harga;
    }
    public void setStok(int stok){
        this.stok = stok;
    }

    public double hitungTotalHarga(int JumlahBeli){
        return harga*JumlahBeli;
    }

    public void beli(int JumlahBeli){
        if (JumlahBeli <=0) {
            System.out.println("Jumlah beli harus lebih dari 0");
            return;
        }
        if (JumlahBeli > stok) {
            System.out.println("Stok "+ nama+ "Tidak cukup! Tersisa " + stok);
            return;
        }
        stok -= JumlahBeli;
        System.out.println("Beli "+nama+" x "+ JumlahBeli + " = Rp." + hitungTotalHarga(JumlahBeli) + " | Sisa stok: "+stok);
    }


    public void tampilInfo() {
        System.out.println("Produk  : " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga   : Rp." + harga);
        System.out.println("Stok    : " + stok);
        System.out.println("------------------");
    }


    public static void main(String[] args) {
        
    }

}