package com.al.myalquran.modal;

public class Modal {

    private String nama;
    private String arti;
    private String asma;
    private int nomor;

    public Modal(String nama, String arti, String asma, int nomor) {
        this.nama = nama;
        this.arti = arti;
        this.asma = asma;
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getArti() {
        return arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }

    public String getAsma() {
        return asma;
    }

    public void setAsma(String asma) {
        this.asma = asma;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }
}
