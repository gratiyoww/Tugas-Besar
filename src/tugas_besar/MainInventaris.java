package tugas_besar;

import java.util.Scanner;

public class MainInventaris {

    public static void main(String[] args) {
        ProsesInventaris ambil = new ProsesInventaris();
        String nama, lokasi, fakultas;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama ruang   \t: ");
        nama = input.nextLine();
        System.out.print("Masukkan lokasi ruang \t: ");
        lokasi = input.nextLine();
        System.out.print("Masukkan fakultas     \t: ");
        fakultas = input.nextLine();
        ambil.hitung_luas_ruang();
        ambil.hitung_bentuk_ruang();
        ambil.hitung_rasio_luas();
        ambil.analisis_pintu_dan_jendela();
        ambil.analisis_kelistrikan();
        ambil.analisis_LCD();
        ambil.analisis_lampu();
    }
}
