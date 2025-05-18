package pertemuan_11.tugas;

// Kelas abstrak Hewan sebagai induk untuk Anjing dan Kucing
abstract class Hewan {
    // Atribut nama hewan
    protected String nama;

    // Konstruktor untuk inisialisasi nama
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Getter untuk mengambil nama hewan
    public String getNama() {
        return nama;
    }

    // Method abstrak yang harus diimplementasikan oleh subclass
    public abstract void bersuara();
}
