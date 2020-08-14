/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje;

import com.elif.vtysproje.dal.DanismanDal;
import com.elif.vtysproje.dal.EgitimDurumuDal;
import com.elif.vtysproje.dal.IsArayanDal;
import com.elif.vtysproje.dal.IsVerenDal;
import com.elif.vtysproje.dal.MeslekDal;
import com.elif.vtysproje.dal.SaglikDurumuDal;
import com.elif.vtysproje.dal.SehirDal;
import com.elif.vtysproje.dal.UserDal;
import com.elif.vtysproje.models.Danisman;
import com.elif.vtysproje.models.EgitimDurumu;
import com.elif.vtysproje.models.IsArayan;
import com.elif.vtysproje.models.IsVeren;
import com.elif.vtysproje.models.Kullanici;
import com.elif.vtysproje.models.Mesaj;
import com.elif.vtysproje.models.Meslek;
import com.elif.vtysproje.models.SaglikDurumu;
import com.elif.vtysproje.models.Sehir;
import java.util.List;

/**
 *
 * @author ELİF
 */
public class KisiEkleFrame extends javax.swing.JFrame {

    private SehirDal sehirDal = new SehirDal();
    private MeslekDal meslekDal = new MeslekDal();
    private EgitimDurumuDal egitimDurumuDal = new EgitimDurumuDal();
    private SaglikDurumuDal saglikDurumuDal = new SaglikDurumuDal();
    private DanismanDal danismanDal = new DanismanDal();
    private UserDal userDal = new UserDal();
    private IsVerenDal isVerenDal = new IsVerenDal();
    private IsArayanDal isArayanDal = new IsArayanDal();

    /**
     * Creates new form KisiEkleFrame
     */
    public KisiEkleFrame() {
        initComponents();
        renderCitiesComboBox();
        renderMeslekComboBox();
        renderSaglikComboBox();
        renderEgitimComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userTypeComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sehirlerComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        meslekComboBox = new javax.swing.JComboBox<>();
        saglikDurumuComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        soyisimText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        isimText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        egitimDurumuComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cinsiyetComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        yasText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tcKimlikText = new javax.swing.JTextField();
        sifreText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        kullaniciEkleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kişi Ekle");

        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İş Veren", "İş Arayan", "Danışman" }));

        jLabel1.setText("Kullanıcı Türü");

        jLabel2.setText("Şehir");

        jLabel3.setText("Meslek");

        jLabel4.setText("Sağlık Durumu");

        jLabel5.setText("Ad");

        jLabel6.setText("Soyad");

        jLabel7.setText("Eğitim Durumu");

        cinsiyetComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın", "Diğer" }));

        jLabel8.setText("Cinsiyet");

        jLabel9.setText("Yaş");

        jLabel10.setText("Email");

        jLabel11.setText("Tc Kimlik No");

        jLabel12.setText("Şifre");

        kullaniciEkleButton.setText("Ekle");
        kullaniciEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciEkleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(userTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(sehirlerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(meslekComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saglikDurumuComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(egitimDurumuComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cinsiyetComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(emailText, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tcKimlikText, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(isimText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(soyisimText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel6)))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel9)
                                    .addComponent(yasText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sifreText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(kullaniciEkleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(77, 77, 77)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(sehirlerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tcKimlikText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yasText))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soyisimText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isimText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meslekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saglikDurumuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(egitimDurumuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(kullaniciEkleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cinsiyetComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullaniciEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciEkleButtonActionPerformed
        Sehir sehir = sehirDal.getByName((String) sehirlerComboBox.getSelectedItem());
        Meslek meslek = meslekDal.getByName((String) meslekComboBox.getSelectedItem());
        SaglikDurumu saglikDurumu = saglikDurumuDal.getByName((String) saglikDurumuComboBox.getSelectedItem());
        EgitimDurumu egitimDurumu = egitimDurumuDal.getByName((String) egitimDurumuComboBox.getSelectedItem());
        String cinsiyet = (String) cinsiyetComboBox.getSelectedItem();
        
        Kullanici kullanici = new Kullanici(
                tcKimlikText.getText(), 
                sifreText.getText(),
                isimText.getText(),
                soyisimText.getText(),
                Integer.parseInt(yasText.getText()),
                emailText.getText(),
                cinsiyet,
                sehir,
                saglikDurumu,
                egitimDurumu,
                null,
                meslek);
        
        userDal.save(kullanici);
        
        switch(userTypeComboBox.getSelectedIndex()){
            case 0:
                isVerenDal.save(new IsVeren(kullanici)); break;
            case 1:
                isArayanDal.save(new IsArayan(kullanici)); break;
            case 2:
                danismanDal.save(new Danisman(kullanici)); break;
        }
        
        this.dispose();
    }//GEN-LAST:event_kullaniciEkleButtonActionPerformed

    private void renderCitiesComboBox() {
        List<Sehir> sehirler = sehirDal.getAll();
        sehirler.forEach(sehir -> sehirlerComboBox.addItem(sehir.getSehirAdi()));
    }

    private void renderMeslekComboBox() {
        List<Meslek> meslekler = meslekDal.getAll();
        meslekler.forEach(meslek -> meslekComboBox.addItem(meslek.getMeslekAdi()));
    }

    private void renderEgitimComboBox() {
        List<EgitimDurumu> egitimDurumlari = egitimDurumuDal.getAll();
        egitimDurumlari.forEach(egitimDurum -> egitimDurumuComboBox.addItem(egitimDurum.getEgitimDurumuAdi()));
    }

    private void renderSaglikComboBox() {
        List<SaglikDurumu> saglikDurumlari = saglikDurumuDal.getAll();
        saglikDurumlari.forEach(saglikDurumu -> saglikDurumuComboBox.addItem(saglikDurumu.getKisiselSaglikDurumAdi()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cinsiyetComboBox;
    private javax.swing.JComboBox<String> egitimDurumuComboBox;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField isimText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton kullaniciEkleButton;
    private javax.swing.JComboBox<String> meslekComboBox;
    private javax.swing.JComboBox<String> saglikDurumuComboBox;
    private javax.swing.JComboBox<String> sehirlerComboBox;
    private javax.swing.JTextField sifreText;
    private javax.swing.JTextField soyisimText;
    private javax.swing.JTextField tcKimlikText;
    private javax.swing.JComboBox<String> userTypeComboBox;
    private javax.swing.JTextField yasText;
    // End of variables declaration//GEN-END:variables
}