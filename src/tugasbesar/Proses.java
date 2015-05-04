
package tugasbesar;

import java.util.Scanner;

public class Proses {
    
    Ruang input = new Ruang ();
    Scanner ok = new Scanner (System.in);
    
    public void analisiskipasangin(){
        
        System.out.println("Input Jumlah Kipas Angin : ");
        input.setJumlahkipasangin(ok.nextInt());
        System.out.println("Input Kondisi Kipas Angin : ");
        input.setKondisikipasangin(ok.nextLine());
        System.out.println("Input Posisi Kipas Angin : ");
        input.setPosisikipasangin(ok.nextLine());
        
        if(input.getJumlahkipasangin()<=2 && input.getKondisikipasangin().equals("baik") && input.getPosisikipasangin().equals("atap ruangan")){
            System.out.println("\tSesuai");
        } else {
            System.out.println("\tTidak Sesuai");
        }
        
    }
    
    public void analisisAC(){
        
        System.out.println("Input Jumlah AC  : ");
        input.setJumlahAC(ok.nextInt());
        System.out.println("Input Kondisi AC : ");
        input.setKondisiAC(ok.nextLine());
        System.out.println("Input Posisi AC  : ");
        input.setPosisiAC(ok.nextLine());
        
        if(input.getJumlahAC()<=1 && input.getKondisiAC().equals("baik") && input.getPosisiAC().equals("dibelakang")){
            System.out.println("\tSesuai");
        }else{
            System.out.println("\tTidak Sesuai");
        }
        
    }
    
    public void analisisinternet(){
        
        System.out.println("Input SSID      : ");
        input.setSSID(ok.nextLine());
        System.out.println("Input Bandwidth : ");
        input.setBandwidth(ok.nextLine());
        
        if(input.getSSID().equals("umm hotspot") && input.getBandwidth().equals("ok")){
            System.out.println("\tSesuai");
        }else{
            System.out.println("\tTidak Sesuai");
        }
        
    }
    
    public void analisisCCTV(){
        
        System.out.println("Input Jumlah CCTV  : ");
        input.setJumlahCCTV(ok.nextInt());
        System.out.println("Input Kondisi CCTV : ");
        input.setKondisiCCTV(ok.nextLine());
        System.out.println("Input Posisi CCTV  : ");
        input.setPosisiCCTV(ok.nextLine());
        
        if(input.getJumlahCCTV()==2 || input.getKondisiCCTV().equals("baik") || input.getPosisiCCTV().equals("depan") || input.getPosisiCCTV().equals("belakang")){
            System.out.println("\tSesuai");
        }else{
            System.out.println("\tTidak Sesuai");
        }
        
    }
    
    public void analisiskebersihan(){
        
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("Input Kondisi Lantai  : "); 
        input.setKondisilantai(ok.nextLine());
        System.out.println("Input Kondisi Dinding : ");
        input.setKondisidinding(ok.nextLine());
        System.out.println("Input Kondisi Atap    : ");
        input.setKondisiatap(ok.nextLine());
        System.out.println("Input Kondisi Pintu   : ");
        input.setKondisipintu(ok.nextLine());
        System.out.println("Input Kondisi Jendela : ");
        input.setKondisijendela(ok.nextLine());
        
        if (input.getKondisijendela().equals("bersih") || input.getKondisilantai().equals("bersih") || input.getKondisidinding().equals("bersih") || input.getKondisiatap().equals("bersih") || input.getKondisipintu().equals("bersih")){
            System.out.println("\tSesuai");
        } else {
            System.out.println("\tTidak Sesuai");
        }

    }
    
    public void analisissirkulasiudara(){
        
        System.out.println("--------------------------");
        System.out.println("Input Sirkulasi Udara   : ");
        input.setSirkulasiudara(ok.nextLine());
        
        if(input.getSirkulasiudara().equals("lancar")){
            System.out.println("\tSesuai");
        } else {
            System.out.println("\tTidak Sesuai");
        }
        
        System.out.println("--------------------------");
        
    }
    
    public void analisispencahayaan(){
        
        System.out.println("Input Nilai Pencahayaan : ");
        input.setNilaipencahayaan(ok.nextInt());
        
        if(input.getNilaipencahayaan()>=250 && input.getNilaipencahayaan()<=350 ){
            System.out.println("\tSesuai");
        } else {
            System.out.println("\tTidak Sesuai");
        }
        
        System.out.println("--------------------------");
        
    }
    
    public void analisiskelembapan(){
        
        System.out.println("Input Kelembapan        : ");
        input.setKelembapan(ok.nextInt());
        
        if(input.getKelembapan()>=70 && input.getKelembapan()<=80 ){
            System.out.println("\tSesuai");
        } else {
            System.out.println("\tTidak Sesuai");
        }
        
        System.out.println("--------------------------");
        
    }
    
    public void analisissuhu(){
        
        System.out.println("Input Suhu              : ");
        input.setSuhu(ok.nextInt());
        
        if(input.getSuhu()>=25 && input.getSuhu()<=35){
            System.out.println("\tSesuai");
        } else{
            System.out.println("\tTidak Sesuai");
        }
        
        System.out.println("--------------------------");

    }
    
}
