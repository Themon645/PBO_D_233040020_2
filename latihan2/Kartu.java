package pertemuan_11.latihan2;

// Mendefinisikan interface Kartu
public interface Kartu {
  // Method untuk otentikasi dengan PIN, mengembalikan true jika PIN benar
  public boolean otentikasi(String pin);

  // Method untuk mengenkripsi (encode) PIN, mengembalikan hasil enkripsi sebagai String
  public String encode (String pin);
}
