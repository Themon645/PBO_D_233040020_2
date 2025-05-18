package pertemuan_11.latihan1;

// Kelas Lingkaran merupakan turunan dari kelas abstrak Bentuk
public class Lingkaran extends Bentuk {

    // Konstruktor Lingkaran, menerima parameter jari-jari dan meneruskannya ke konstruktor Bentuk
    public Lingkaran(int jari2) {
        super(jari2);
    }

    /**
     * Rumus luas lingkaran: PHI * r * r
     */

    // Override method abstrak Luas() dari Bentuk untuk menghitung luas lingkaran
    @Override
    public double Luas() {
        return PHI * jari2 * jari2;
    }
  
}
