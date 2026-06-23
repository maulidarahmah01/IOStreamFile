package bagian3.kontak;

public class MainKontak {

    public static void main(String[] args) {

        // Membuat buku kontak
        BukuKontak buku = new BukuKontak("kontak.txt");

        // Menambah kontak
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@gmail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@gmail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@gmail.com"));

        // Menampilkan dan menyimpan
        buku.tampilkanSemua();
        buku.simpanKeBerkas();

        System.out.println();

        // Membaca dari file
        BukuKontak bukuLain = new BukuKontak("kontak.txt");

        bukuLain.muatDariBerkas();

        bukuLain.tampilkanSemua();

        System.out.println("Jumlah kontak : " + bukuLain.jumlahKontak());

        System.out.println();

        // Cari kontak
        bukuLain.cariKontak("Budi");

        System.out.println();

        // Hapus kontak
        bukuLain.hapusKontak("Andi");

        // Simpan perubahan
        bukuLain.simpanKeBerkas();

        System.out.println();

        bukuLain.tampilkanSemua();
    }
}