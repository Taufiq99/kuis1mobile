package com.example.kuis1mobile;

public class Chat {
    private String nama;
    private String status;
    private String alamat;
    private Integer foto;

    Chat(String nama, String status, String alamat, Integer foto) {
        this.nama = nama;
        this.status = status;
        this.alamat = alamat;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
