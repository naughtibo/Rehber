///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package rehberuygulaması;
//
//import java.util.Scanner;
//
///**
// *
// * @author 112
// */
//public class KullaniciGirisi {
//
//    Scanner scanner = new Scanner(System.in);
//    String kullaniciAdi;
//    String sifre;
//    Kisiler kisiler = new Kisiler();
//
//    public void login() {
//        System.out.println("Kullanıcı Adını Gir");
//        kullaniciAdi = scanner.next();
//        System.out.println("Şifreni Gir");
//        sifre = scanner.next();
//        if (kullaniciAdi.equals("admin") & (sifre.equals("a"))) {
//            adminIslemleri();
//        } else if (kullaniciAdi.equals("user") & (sifre.equals("a"))) {
//            userIslemleri();
//        } else {
//            System.out.println("Kullanıcı Adı veya Şifrenizi Kontrol Ediniz!!");
//            login();
//        }
//    }
//
//    public void adminIslemleri() {
//        System.out.println("1- Kişi Ekleme Yap");
//        System.out.println("2- Kişi Listele");
//        System.out.println("3- Kişi Sil");
//        System.out.println("4- Kişi Güncelleme Yap");
//        System.out.println("5- Çıkış Yap");
//        System.out.println("Lütfen Tercihinizi Yapınız ");
//        int tercih = scanner.nextInt();
//
//        switch (tercih) {
//            case 1:
//                kisiler.kisiEkle();
//                adminIslemleri();
//
//            case 2:
//                for (Kisi k : kisiler.liste) {
////                    kisiler.kisiListele(k);
//                }
//                adminIslemleri();
//            case 3:
//                kisiler.liste.remove(0);
//                adminIslemleri();
//            case 4:
//                for (Kisi k : kisiler.liste) {
////                    kisiler.kisiListele(k);
//                }
//                System.out.println("Güncellenecek kişinin indeksini seçiniz ");
//                int indeks = scanner.nextInt();
//                if (indeks > kisiler.liste.size() - 1) {
//                    System.out.println("İndeks Bulunamadı");
//                    adminIslemleri();
//                } else {
//                    Kisi element = new Kisi();
//                    System.out.println("Ad Giriniz");
//                    String ad = scanner.nextLine();
//                    element.setAd(ad);
//
//                    System.out.println("Soyad Giriniz");
//                    String soyad = scanner.nextLine();
//                    element.setSoyad(soyad);
//
//                    kisiler.liste.set(indeks, element);
//
//                }
//                break;
//            case 5:
//                System.exit(0);
//
//            default:
//                adminIslemleri();
//
//        }
//
//    }
//
//    public void userIslemleri() {
//        System.out.println("1- Kişi Listele");
//        System.out.println("2- Çıkış Yap");
//        System.out.println("Lütfen Tercihinizi Yapınız ");
//        int tercih = scanner.nextInt();
//        if (tercih == 1) {
//            Kisi k = new Kisi();
//            k.setAd("Ali");
//            k.setSoyad("tan");
//            kisiler.liste.add(k);
////            kisiler.kisiListele(k);
//            userIslemleri();
//        } else if (tercih == 2) {
//            System.exit(0);
//        } else {
//            userIslemleri();
//        }
//
//    }
//}
