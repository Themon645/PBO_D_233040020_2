package pertemuan_11.tugas;

// Kelas Kucing turunan dari Hewan dan mengimplementasikan Mamalia
public class Kucing extends Hewan implements Mamalia {
    // Konstruktor Kucing, memanggil konstruktor Hewan
    public Kucing(String nama) {
        super(nama);
    }

    // Implementasi method bersuara dari Hewan
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong Meong");
    }

    // Implementasi method jenis dari Mamalia
    @Override
    public void jenis() {
        System.out.println(nama + " adalah jenis kucing: persia");
    }
}
