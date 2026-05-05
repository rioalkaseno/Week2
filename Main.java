public class Main {

    public static void main(String[] args) {
        Eletronik mesinCuci = new Eletronik("Mesin Cuci", 2500000.0, 5, "Elektronik", 365);
        mesinCuci.setGaransi(0);
        mesinCuci.tampilData();
    }
}