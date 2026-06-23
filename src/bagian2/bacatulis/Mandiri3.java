package bagian2.bacatulis;

import java.io.*;

public class Mandiri3 {
    public static void main(String[] args) {

        int jumlahBaris = 0;

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }

            System.out.println("Jumlah baris: " + jumlahBaris);

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}