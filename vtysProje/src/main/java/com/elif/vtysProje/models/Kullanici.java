/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author ELİF
 */
@Entity
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String tcNo;
    private String sifre;
    private String ad;
    private String soyad;
    private int yas;
    private String mail;
    private String cinsiyet;
    @OneToOne
    @JoinColumn(name = "sehir_id")
    private Sehir sehir;
    @OneToOne
    @JoinColumn(name = "saglik_durumu_id")
    private SaglikDurumu saglikDurumu;
    @OneToOne
    @JoinColumn(name = "egitim_durumu_id")
    private EgitimDurumu egitimDurumu;
    @OneToOne
    @JoinColumn(name = "mesaj_id")
    private Mesaj mesaj;
    @OneToOne
    @JoinColumn(name = "meslek_id")
    private Meslek meslek;

    public Kullanici(){}
    
    public Kullanici(String tcNo, String sifre, String ad, String soyad, int yas, String mail, String cinsiyet, Sehir sehir, SaglikDurumu saglikDurumu, EgitimDurumu egitimDurumu, Mesaj mesaj, Meslek meslek) {
        this.tcNo = tcNo;
        this.sifre = sifre;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.mail = mail;
        this.cinsiyet = cinsiyet;
        this.sehir = sehir;
        this.saglikDurumu = saglikDurumu;
        this.egitimDurumu = egitimDurumu;
        this.mesaj = mesaj;
        this.meslek = meslek;
    }
    
    

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Sehir getSehir() {
        return sehir;
    }

    public void setSehir(Sehir sehir) {
        this.sehir = sehir;
    }

    public SaglikDurumu getSaglikDurumu() {
        return saglikDurumu;
    }

    public void setSaglikDurumu(SaglikDurumu saglikDurumu) {
        this.saglikDurumu = saglikDurumu;
    }

    public EgitimDurumu getEgitimDurumu() {
        return egitimDurumu;
    }

    public void setEgitimDurumu(EgitimDurumu egitimDurumu) {
        this.egitimDurumu = egitimDurumu;
    }

    public Mesaj getMesaj() {
        return mesaj;
    }

    public void setMesaj(Mesaj mesaj) {
        this.mesaj = mesaj;
    }

    public Meslek getMeslek() {
        return meslek;
    }

    public void setMeslek(Meslek meslek) {
        this.meslek = meslek;
    }
    
    
}
