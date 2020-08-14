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

/**
 *
 * @author ELİF
 */
@Entity
public class Meslek {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "meslek_adi")
    private String meslekAdi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeslekAdi() {
        return meslekAdi;
    }

    public void setMeslekAdi(String meslekAdi) {
        this.meslekAdi = meslekAdi;
    }

}
