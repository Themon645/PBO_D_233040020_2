package pertemuan_11.latihan1;

// Kelas abstrak Bentuk sebagai dasar untuk bentuk-bentuk lain (misal: Lingkaran, Bola, dll)
public abstract class Bentuk {
  // Konstanta PHI untuk nilai π (pi)
  protected double PHI = 3.14;
  // Atribut jari-jari, dapat digunakan oleh subclass
  protected int jari2;

  // Konstruktor untuk menginisialisasi nilai jari-jari
  public Bentuk(int jari2) {
    super();
    this.jari2 = jari2;
  }

  // Method abstrak untuk menghitung luas, harus diimplementasikan oleh subclass
  public abstract double Luas();

  // Getter untuk mengambil nilai jari-jari
  public int getJari2() {
    return jari2;
  }
  
  // Setter untuk mengubah nilai jari-jari
  public void setJari2(int jari2) {
    this.jari2 = jari2;
  }
}
