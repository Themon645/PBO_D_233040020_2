package pertemuan_11.latihan2;

// Mendefinisikan kelas KartuElektronik yang mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu {
    // Atribut untuk menyimpan kode bank
    private String Kodebank;
    // Atribut untuk menyimpan PIN
    private String pin;

    // Konstruktor untuk inisialisasi kode bank dan PIN
    public KartuElektronik(String KodeBank, String pin) {
      super();
      this.Kodebank = KodeBank;  
      this.pin = pin;
    }

    // Implementasi method otentikasi dari interface Kartu
    // Mengembalikan true jika PIN yang dimasukkan sesuai dengan PIN yang tersimpan
    @Override
    public boolean otentikasi(String pinInput) {
        if (pin.equals(pinInput)) {
            return true;
        } else {
            return false;
        }
    }

    // Implementasi method encode dari interface Kartu
    // Saat ini belum diimplementasikan, hanya mengembalikan null
    @Override
    public String encode(String pin) {
      //melakukan enkripsi inputan PIN
      return null;
    }
  
}
