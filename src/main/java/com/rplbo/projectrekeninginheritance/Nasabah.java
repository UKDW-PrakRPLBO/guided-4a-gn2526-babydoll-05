package com.rplbo.projectrekeninginheritance;

public class Nasabah {
    private String nama;
    private String identitas;
    private String alamat;
    public Nasabah(String nama, String identitas, String alamat) {
        this.nama = nama;
        this.identitas = identitas;
        this.alamat = alamat;
    }
    public String getNama() {
        return nama;
    }
    public String getIdentitas() {
        return identitas;
    }
    public String getAlamat() {
        return alamat;
    }
}