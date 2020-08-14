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
@Table(name = "egitim_durumu")
public class EgitimDurumu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "egitim_durumu_adi")
    private String egitimDurumuAdi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEgitimDurumuAdi() {
        return egitimDurumuAdi;
    }

    public void setEgitimDurumuAdi(String egitimDurumuAdi) {
        this.egitimDurumuAdi = egitimDurumuAdi;
    }
    
    
}
