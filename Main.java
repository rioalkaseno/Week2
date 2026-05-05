
public class Main {

    public static void main(String[] args) {
        Eletronik mesinCuci = new Eletronik("Mesin Cuci", 2500000.0, 5, "Elektronik", 365);
        mesinCuci.setGaransi(365);
        mesinCuci.tampilInfo();

        System.out.println("");

        Makanan Burger = new Makanan("Burger", 10000.0, 5, "Makanan", 365);
        Burger.setExpired(4, "Nasi");
        Burger.tampilInfo();


    }
}