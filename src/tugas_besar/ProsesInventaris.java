package tugas_besar;

import java.util.Scanner;

public class ProsesInventaris {

    ControlInventaris ambil = new ControlInventaris();
    Scanner input = new Scanner(System.in);
    int luas;

    public void hitung_luas_ruang() {
        System.out.print("\n");
        System.out.print("Masukkan panjang ruang\t: ");
        ambil.setPanjang(input.nextInt());
        System.out.print("Masukkan lebar ruang  \t: ");
        ambil.setLebar(input.nextInt());
        luas = ambil.getPanjang() * ambil.getLebar();
        System.out.println("-----------------------------------------");
        System.out.println("luas : " + luas);
    }

    public void hitung_bentuk_ruang() {
        String bentuk;
        if (ambil.getPanjang() != luas) {
            bentuk = "persegi panjang";
            if (bentuk.equals("persegi panjang")) {
                System.out.println("Bentuk ruangan adalah : " + bentuk);
                System.out.println("Kriteria tidak sesuai");
                System.out.println("-----------------------------------------");
            }
        } else {
            bentuk = "persegi";
            System.out.println("Bentuk ruangan adalah : " + bentuk);
        }
    }

    public void hitung_rasio_luas() {
        int rasio;
        System.out.print("Masukkan jumlah kursi \t: ");
        ambil.setJml_kursi(input.nextInt());
        rasio = luas / ambil.getJml_kursi();
        if (rasio >= 0.5) {
            System.out.println("-----------------------------------------");
            System.out.println("rasio luas : " + rasio);
            System.out.println("Kriteria sesuai");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Kriteria tidak sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisis_pintu_dan_jendela() {
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan jumlah pintu \t: ");
        ambil.setJml_pintu(input.nextInt());
        System.out.print("Masukkan jumlah jendela       : ");
        ambil.setJml_jendela(input.nextInt());
        if (ambil.getJml_pintu() >= 2 && ambil.getJml_jendela() >= 1) {
            System.out.println("-----------------------------------------");
            System.out.println("Jumlah pintu = " + ambil.getJml_pintu());
            System.out.println("Jumlah jendela = " + ambil.getJml_jendela());
            System.out.println("Kriteria sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Kriteria tidak sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisis_kelistrikan() {
        //int baik = 4;
        System.out.println("Masukkan jumlah stop kontak : ");
        ambil.setJml_skontak(input.nextInt());
        System.out.println("Masukkan kondisi stop kontak : ");
        ambil.setKondisi_skontak(input.nextLine());
        //System.out.println("");
        System.out.println("Masukkan posisi stop kontak : ");
        ambil.setPosisi_skontak(input.nextLine());
        if ((ambil.getJml_skontak() >= 4) && (ambil.getPosisi_skontak().equals("dipojok ruang")) || (ambil.getPosisi_skontak().equals("dekat dosen"))) {
            System.out.println("-----------------------------------------");
            System.out.println("Jumlah stop kontak : " + ambil.getJml_skontak());
            System.out.println("Kondisi stop kontak : "+ ambil.getKondisi_skontak());
            System.out.println("Posisi stop kontak : " + ambil.getPosisi_skontak());
            System.out.println("Kriteria sesuai");
            System.out.println("-----------------------------------------");
        } //if stteker baik = 4
        else {
            System.out.println("-----------------------------------------");
            System.out.println("Kriteria tidak sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisis_LCD() {
        System.out.print("Masukkan jumlah kabel LCD : ");
        ambil.setJml_kLCD(input.nextInt());
        System.out.print("Masukkan kondisi kabel LCD : ");
        ambil.setKondisi_kLCD(input.nextLine());
        System.out.println("");
        System.out.print("Masukkan posisi kabel LCD : ");
        ambil.setPosisi_kLCD(input.nextLine());
        if (ambil.getJml_kLCD() >= 1 && ambil.getKondisi_kLCD().equals("berfungsi") && ambil.getPosisi_kLCD().equals("dekat dosen")) {
            System.out.println("-----------------------------------------");
            System.out.println("Jumlah kabel LCD : " + ambil.getJml_kLCD());
            System.out.println("Kondisi kabel LCD : " + ambil.getKondisi_kLCD());
            System.out.println("Posisi kabel LCD : " + ambil.getPosisi_kLCD());
            System.out.println("Kriteria sesuai");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Kriteria tidak sesuai");
            System.out.println("-----------------------------------------");
        }
    }

    public void analisis_lampu() {
        System.out.print("Masukkan jumlah lampu \t: ");
        ambil.setJml_lampu(input.nextInt());
        System.out.print("Masukkan kondisi lampu \t: ");
        ambil.setKondisi_lampu(input.nextLine());
        System.out.println("");
        System.out.print("Masukkan posisi lampu \t: ");
        ambil.setPosisi_lampu(input.nextLine());
        if (ambil.getJml_lampu() >= 18 && ambil.getPosisi_lampu().equals("atap ruangan")) {
            System.out.println("-----------------------------------------");
            System.out.println("Jumlah lampu : " + ambil.getJml_lampu());
            System.out.println("Posisi lampu : " + ambil.getPosisi_lampu());
            System.out.println("Kriteria sesuai");
            System.out.println("-----------------------------------------");
        } //else if kondisi baik = 18, then sesuai
        else {
            System.out.println("-----------------------------------------");
            System.out.println("Kriteria tidak sesuai");
            System.out.println("-----------------------------------------");
        }
    }
}
