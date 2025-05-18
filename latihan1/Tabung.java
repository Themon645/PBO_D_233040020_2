package pertemuan_11.latihan1;

// Kelas Tabung merupakan turunan dari kelas abstrak Bentuk
public class Tabung extends Bentuk {
    // Atribut tinggi khusus untuk tabung
    private int tinggi;

    // Konstruktor tanpa parameter, memanggil konstruktor Bentuk dengan jari-jari 0
    public Tabung() {
        super(0);
    }

    // Konstruktor Tabung dengan parameter jari-jari dan tinggi
    public Tabung(int jari2, int tinggi) {
        super(jari2); // Memanggil konstruktor Bentuk untuk inisialisasi jari-jari
        this.tinggi = tinggi; // Inisialisasi tinggi tabung
    }

    /**
     * Override method Luas() dari Bentuk
     * Menghitung luas permukaan tabung dengan rumus: 2 * PHI * r * (r + t)
     */
    @Override
    public double Luas() {
        return (2 * PHI * jari2 * (jari2 + tinggi));
    }

    // Getter untuk mengambil nilai tinggi tabung
    public int getTinggi() {
        return tinggi;
    }

    // Setter untuk mengubah nilai tinggi tabung
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
  
}
