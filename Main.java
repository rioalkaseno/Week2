//package berbeda, bukan subclass class main

//import base.Produk;

public class Main {

    public static void main(String[] args) {
        Produk p = new Produk("Baju", 5000, 5,"Pakaian");
        

        System.out.println(p.getNama());

        System.out.println(p.getHarga());
        p.setHarga(20000);
        System.out.println(p.getHarga());

        System.out.println(p.getStok());
        System.out.println(p.kategori);
    
    }
    
}
