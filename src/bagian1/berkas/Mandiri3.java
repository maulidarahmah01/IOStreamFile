package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class Mandiri3 {
    public static void main(String[] args) throws IOException {

        File berkas = new File("sementara.txt");

        berkas.createNewFile();

        System.out.println("Sebelum dihapus: " + berkas.exists());

        berkas.delete();

        System.out.println("Sesudah dihapus: " + berkas.exists());

    }
}