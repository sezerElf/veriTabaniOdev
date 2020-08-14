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
@Table(name = "calisma_sekli")
public class CalismaSekli {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name="calisma_sekli_adi")
    private String calismaSekliAdi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalismaSekliAdi() {
        return calismaSekliAdi;
    }

    public void setCalismaSekliAdi(String calismaSekliAdi) {
        this.calismaSekliAdi = calismaSekliAdi;
    }
    
    
}
