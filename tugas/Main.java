package pertemuan_11.tugas;

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Anjing dan Kucing, bertipe referensi Hewan
        Hewan h1 = new Anjing("Bodi");
        Hewan h2 = new Kucing("Mimi");

        // Memanggil method bersuara pada objek Anjing
        h1.bersuara();
        // Melakukan casting ke Mamalia agar bisa memanggil method jenis pada objek Anjing
        ((Mamalia) h1).jenis();

        System.out.println(); // Memberi jarak antar output

        // Memanggil method bersuara pada objek Kucing
        h2.bersuara();
        // Melakukan casting ke Mamalia agar bisa memanggil method jenis pada objek Kucing
        ((Mamalia) h2).jenis();
    }
}
