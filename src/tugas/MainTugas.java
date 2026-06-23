package tugas;

// Nama : Maulida Rahmah
// NPM  : 2410010199

public class MainTugas {

    public static void main(String[] args) {

        // Array kategori
        String[] kategori = {"Makanan", "Minuman", "Alat Tulis"};

        System.out.println("=== Kategori Barang ===");
        for (String k : kategori) {
            System.out.println(k);
        }

        System.out.println();

        // Membuat gudang
        Gudang gudang = new Gudang("barang.txt");

        // Menambah minimal 5 barang
        gudang.tambahBarang(new Barang("Buku", 5000, 10));
        gudang.tambahBarang(new Barang("Pensil", 3000, 15));
        gudang.tambahBarang(new Barang("Pulpen", 4000, 20));
        gudang.tambahBarang(new Barang("Penghapus", 2000, 8));
        gudang.tambahBarang(new Barang("Penggaris", 6000, 5));

        gudang.tampilkanSemua();

        System.out.println();
        gudang.simpanKeBerkas();

        System.out.println();

        // Membuat objek baru
        Gudang gudangBaru = new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        gudangBaru.tampilkanSemua();

        System.out.println();
        System.out.println("Total nilai persediaan = Rp" +
                           gudangBaru.totalNilai());
    }
}