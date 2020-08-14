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
import javax.persistence.Table;

/**
 *
 * @author ELİF
 */
@Entity
@Table(name = "saglik_durumu")
public class SaglikDurumu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "kisisel_saglik_durum_adi")
    private String kisiselSaglikDurumAdi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKisiselSaglikDurumAdi() {
        return kisiselSaglikDurumAdi;
    }

    public void setKisiselSaglikDurumAdi(String kisiselSaglikDurumAdi) {
        this.kisiselSaglikDurumAdi = kisiselSaglikDurumAdi;
    }
   
    
}
