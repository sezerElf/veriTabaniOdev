/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ELİF
 */
@Entity
@Table(name = "ilan_adres")
public class IlanAdres {
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
     private int id;
     private String isim;
     @Column(name = "posta_kodu")
     private int postaKodu;
     @OneToOne
     @JoinColumn(name = "ilan_id")
     private Ilan ilan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(int postaKodu) {
        this.postaKodu = postaKodu;
    }

    public Ilan getIlan() {
        return ilan;
    }

    public void setIlan(Ilan ilan) {
        this.ilan = ilan;
    }
     
     
}
