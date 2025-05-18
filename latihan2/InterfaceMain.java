package pertemuan_11.latihan2;

// Kelas utama untuk menjalankan program
public class InterfaceMain {
  public static void main(String[] args) {
    // Membuat objek KartuElektronik dengan id "IF111" dan PIN "123"
    KartuElektronik kartu = new KartuElektronik("IF111", "123");
    // Melakukan otentikasi dengan memasukkan PIN "123" dan menampilkan hasilnya
    System.out.println("otentikasi: " + kartu.otentikasi("123"));
  }
}