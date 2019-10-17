package pbo1.pkg10118031.latihan38.objectoriented.perhitunganlingkaran;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini berisi program menghitung Lingkaran
 */
public class PBO110118031Latihan38ObjectOrientedPerhitunganLingkaran {

    public static void main(String[] args) {

        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
}
