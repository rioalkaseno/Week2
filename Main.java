
public class Main {

    public static void main(String[] args) {
        
        Elektronik laptop = new Elektronik("Laptop Asus","Asus",8500000,10,2);
        Elektronik hp = new Elektronik("HP Samsung","Samsung",3200000,25,1);
        Makanan indomie = new Makanan("Indomie Goreng", 3500, 100, "2026-12-01", "Mie Instan");
        Makanan roti = new Makanan("Roti Tawar", 8000, 50, "2026-04-01", "Roti");

//Overriding - satu nama method untuk semua
        System.out.println("=====DAFTAR PRODUK=====");
        laptop.tampilInfo();
        hp.tampilInfo();
        indomie.tampilInfo();
        roti.tampilInfo();  

//Overloading hitung pajak Class Elektronik
        System.out.println("==== RINCIAN PAJAK ELEKTRONIK ====");

//Versi 1 Pajak Standar
        double pajakLaptop = laptop.hitungPajak(1);
        double totalLaptop = laptop.hitungHargaSetelahPajak(1);
        System.out.println("Laptop 1x (PPN Standar 11%)");
        System.out.println("    Subtotal : " + laptop.hitungTotalHarga(2));
        System.out.println("    Pajak    : " + pajakLaptop);
        System.out.println("    Total    : " + totalLaptop);

//Versi 2 Pajak Custom 5% (Misal barang impor khusus)
        double pajakHpCustom = laptop.hitungPajak(1);
        System.out.println("Laptop 2x (Pajak Custom 5%)");
        System.out.println("    Subtotal : " + hp.hitungTotalHarga(2));
        System.out.println("    Pajak    : " + pajakHpCustom);
        System.out.println("    Total    : " + (hp.hitungTotalHarga(2)) + (pajakHpCustom));

//Overloading hitung Diskon
       System.out.println("==== RINCIAN DISKON MAKANAN ====");

//Versi 1 Diskon otomatis beli >=10
        System.out.println("Indomie x10 (Diskon Otomatis)");
        System.out.println("    Subtotal : " + indomie.hitungTotalHarga(10));
        System.out.println("    Diskon    : " + indomie.hitungDiskon(10));
        System.out.println("    Total    : " + indomie.hitungHargaSetelahDiskon(10));

//Versi 2 Diskon Custom 15% (Misal promo spesial)
        System.out.println("Indomie x10 (Diskon Otomatis)");
        System.out.println("    Subtotal : " + roti.hitungTotalHarga(5));
        System.out.println("    Diskon   : " + roti.hitungDiskon(5, 15));
        System.out.println("    Total    : " + (roti.hitungTotalHarga(5) - roti.hitungDiskon(5, 15)));


    }


        
}