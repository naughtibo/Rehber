/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehberuygulaması;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 112
 */
public class Kisiler {
    
    public List<Kisi> list = new ArrayList<>();
    DosyaIslemleri di = new DosyaIslemleri();
    StringBuilder sb = new StringBuilder();
    
    public void listeYukle() {
        String dosyaIcerik = di.dosyaOku();
        list.clear();
        String[] kisiString = dosyaIcerik.split("@");
        
        
        for (int i = 0; i < kisiString.length; i++) {
            String[] kisiDetayString = kisiString[i].split("\\|");
            //Long no = Long.parseLong(kisiDetayString[0]);
            String ad = kisiDetayString[0];
            String soyad = kisiDetayString[1];
            char cinsiyet = kisiDetayString[2].charAt(0);
            Date dogumTarihi = new Date(kisiDetayString[3]);
//            Integer yas = Integer.parseInt(kisiDetayString[3]);
//            Long tc = Long.parseLong(kisiDetayString[6]);
//            Long tel = Long.parseLong(kisiDetayString[0]);
            String adres = kisiDetayString[4];
            list.add(new Kisi(ad, soyad, cinsiyet, dogumTarihi, adres));
        }
    }
    
    public void listeYedekle() {
        for (Kisi k : list) {
            sb.append(k.getAd() + "|" + k.getSoyad() + "|" + k.getCinsiyet() + "|" + k.getDogumTarihi() + "|" + k.getAdres());
            di.dosyaYaz(sb.toString());
        }
        
    }

//    Scanner scanner = new Scanner(System.in);
//    Kisi kisi;
//    Kisi kisi2;
//    Kisi kisi3;
    public void kisiEkle() {
//        kisi = new Kisi();
//        System.out.println("Ad Giriniz");
//        String ad = scanner.nextLine();
//        kisi.setAd(ad);
//
//        System.out.println("Soyad Giriniz");
//        String soyad = scanner.nextLine();
//        kisi.setSoyad(soyad);

//        System.out.println("Adres Giriniz");
//        String adres = scanner.nextLine();
//        kisi.setAdres(adres);
//
//        System.out.println("Cinsiyet Giriniz");
//        String cinsiyet = scanner.nextLine();
//        kisi.setCinsiyet(cinsiyet.charAt(0));
//
//        System.out.println("Tc Giriniz");
//        Long tc = scanner.nextLong();
//        kisi.setTc(tc);
//
//        System.out.println("Tel Giriniz");
//        Long tel = scanner.nextLong();
//        kisi.setTel(tel);
//        System.out.println("Doğum Tarihi Giriniz Giriniz");
//        Date dogumTarihi=scanner.next
//        kisi.setDogumTarihi(new Date(1980, 10, 5));
//        liste.add(kisi);
        //        kisi2 = new Kisi();
        //        kisi2.setAd("Ayşe");
        //        kisi2.setSoyad("Öz");
        //        kisi2.setAdres("Etimesgut");
        //        kisi2.setCinsiyet('K');
        //        kisi2.setTc(90876543212L);
        //        kisi2.setTel(05101001010L);
        //        kisi2.setDogumTarihi(new Date(1982, 1, 5));
        //        liste.add(kisi2);
        //
        //        kisi3 = new Kisi();
        //        kisi3.setAd("Ali");
        //        kisi3.setSoyad("Özel");
        //        kisi3.setAdres("Sincan");
        //        kisi3.setCinsiyet('E');
        //        kisi3.setTc(90863443212L);
        //        kisi3.setTel(05601401610L);
        //        kisi3.setDogumTarihi(new Date(1987, 1, 5));
        //        liste.add(kisi3);
        //
//        for (Kisi k : liste) {
//            kisiListele(k);
//        }
        //        Kisi k = sahis.stream().filter(item -> item.getAdres().equals("Eryaman")).findFirst().get();
        //        kisiGoruntule(k);
    }

//    public void kisiListele(Kisi kisi) {
//        System.out.println("------------------------------------------");
//        System.out.println("Adı          : " + kisi.getAd());
//        System.out.println("Soyadı       : " + kisi.getSoyad());
////        System.out.println("Adres        : " + kisi.getAdres());
////        System.out.println("Cinsiyet     : " + kisi.getCinsiyet());
//////        System.out.println("doğum Tarihi : " + kisi.getDogumTarihi());
//////        System.out.println("Yaş          : " + kisi.getYas());
////        System.out.println("Tel          : " + kisi.getTel());
////        System.out.println("TC           : " + kisi.getTc());
//        System.out.println("------------------------------------------");
//
//    }
//    public void kisiGuncelle(Kisi k){
//        k.set
//    }
}
