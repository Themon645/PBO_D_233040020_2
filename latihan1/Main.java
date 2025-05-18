package pertemuan_11.latihan1;

// Kelas utama untuk menjalankan program
public class Main {
  public static void main(String[] args) {
    // Menampilkan judul untuk bagian lingkaran
    System.out.println("=== Lingkaran ===");
    // Membuat objek Lingkaran dengan jari-jari 10, disimpan dalam variabel bertipe Bentuk (polimorfisme)
    Bentuk lingkaran = new Lingkaran(10);
    // Menampilkan jari-jari lingkaran
    System.out.println("Jari-jari Lingkaran: " + lingkaran.getJari2());
    // Menampilkan luas lingkaran (memanggil method Luas() yang dioverride di Lingkaran)
    System.out.println("Luas Lingkaran: " + lingkaran.Luas());

    // Menampilkan judul untuk bagian tabung
    System.out.println("\n=== Tabung ===");
    // Membuat objek Tabung dengan jari-jari 10 dan tinggi 5
    Tabung tabung = new Tabung(10, 5);
    // Menampilkan jari-jari tabung
    System.out.println("Jari-jari Tabung: " + tabung.getJari2());
    // Menampilkan tinggi tabung
    System.out.println("Tinggi Tabung: " + tabung.getTinggi());
    // Menampilkan luas permukaan tabung (memanggil method Luas() yang dioverride di Tabung)
    System.out.println("Luas Tabung: " + tabung.Luas());
  }
}
