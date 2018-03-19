/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehberuygulaması;

import java.util.Date;

/**
 *
 * @author 112
 */
public class Kisi {

    //private Long no;
    private String ad;
    private String soyad;
    private char cinsiyet;
    private Date dogumTarihi;
   // private Integer yas;
    //private Long tc, tel;
    private String adres;

    public Kisi() {
    }

    public Kisi(String ad, String soyad, char cinsiyet, Date dogumTarihi, String adres) {
        //this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.dogumTarihi = dogumTarihi;
        //this.yas = yas;
        //this.tc = tc;
        //this.tel = tel;
        this.adres = adres;
    }


//    public Long getNo() {
//        return no;
//    }
//    public void setNo(Long no) {
//        this.no = no;
//    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

//    public Integer getYas() {
//        return yas;
//    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

//    public Long getTc() {
//        return tc;
//    }
//
//    public void setTc(Long tc) {
//        this.tc = tc;
//    }
//
//    public Long getTel() {
//        return tel;
//    }
//
//    public void setTel(Long tel) {
//        this.tel = tel;
//    }
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public char getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(char cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
