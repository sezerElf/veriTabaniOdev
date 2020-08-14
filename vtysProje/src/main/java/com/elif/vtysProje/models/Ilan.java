/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje.models;

import java.util.Date;
import javax.persistence.Column;
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
public class Ilan {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "is_tanimi")
    private String isTanimi;
    @Column(name = "goruntulenme_sayisi")
    private int goruntulenmeSayisi;
    @Column(name = "son_basvuru_tarihi")
    private Date sonBasvuruTarihi;
    @OneToOne
    @JoinColumn(name = "is_veren_id")
    private IsVeren isVeren;
    @OneToOne
    @JoinColumn(name = "sehir_id")
    private Sehir sehir;
    @OneToOne
    @JoinColumn(name = "sektor_id")
    private Sektor sektor;
    @OneToOne
    @JoinColumn(name = "calisma_sekli_id")
    private CalismaSekli calismaSekli;
    @OneToOne
    @JoinColumn(name = "is_yeri_turu_id")
    private IsYeriTuru isYeriTuru;
    @OneToOne
    @JoinColumn(name = "meslek_id")
    private Meslek meslek;
    @OneToOne
    @JoinColumn(name = "saglik_durumu_id")
    private SaglikDurumu saglikDurumu;
    @OneToOne
    @JoinColumn(name = "egitim_durumu_id")
    private EgitimDurumu egitimDurumu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsTanimi() {
        return isTanimi;
    }

    public void setIsTanimi(String isTanimi) {
        this.isTanimi = isTanimi;
    }

    public int getGoruntulenmeSayisi() {
        return goruntulenmeSayisi;
    }

    public void setGoruntulenmeSayisi(int goruntulenmeSayisi) {
        this.goruntulenmeSayisi = goruntulenmeSayisi;
    }

    public Date getSonBasvuruTarihi() {
        return sonBasvuruTarihi;
    }

    public void setSonBasvuruTarihi(Date sonBasvuruTarihi) {
        this.sonBasvuruTarihi = sonBasvuruTarihi;
    }

    public IsVeren getIsVeren() {
        return isVeren;
    }

    public void setIsVeren(IsVeren isVeren) {
        this.isVeren = isVeren;
    }

    public Sehir getSehir() {
        return sehir;
    }

    public void setSehir(Sehir sehir) {
        this.sehir = sehir;
    }

    public Sektor getSektor() {
        return sektor;
    }

    public void setSektor(Sektor sektor) {
        this.sektor = sektor;
    }

    public CalismaSekli getCalismaSekli() {
        return calismaSekli;
    }

    public void setCalismaSekli(CalismaSekli calismaSekli) {
        this.calismaSekli = calismaSekli;
    }

    public IsYeriTuru getIsYeriTuru() {
        return isYeriTuru;
    }

    public void setIsYeriTuru(IsYeriTuru isYeriTuru) {
        this.isYeriTuru = isYeriTuru;
    }

    public Meslek getMeslek() {
        return meslek;
    }

    public void setMeslek(Meslek meslek) {
        this.meslek = meslek;
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
    
    
}
