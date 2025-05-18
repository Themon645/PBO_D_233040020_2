package pertemuan_11.tugas;

// Kelas Anjing turunan dari Hewan dan mengimplementasikan Mamalia
public class Anjing extends Hewan implements Mamalia {
    // Konstruktor Anjing, memanggil konstruktor Hewan
    public Anjing(String nama) {
        super(nama);
    }

    // Implementasi method bersuara dari Hewan
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk Guk");
    }

    // Implementasi method jenis dari Mamalia
    @Override
    public void jenis() {
        System.out.println(nama + " adalah jenis anjing: bulldog");
    }
}



