package com.Topik10;

public class Member {
    String NIK;
    String Nama;
    String nomorTelp;
    double saldo=0;

    public Member(String NIK, String nama, String nomorTelp, double saldo) {
        this.NIK = NIK;
        Nama = nama;
        this.nomorTelp = nomorTelp;
        this.saldo = saldo;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNomorTelp() {
        return nomorTelp;
    }

    public void setNomorTelp(String nomorTelp) {
        this.nomorTelp = nomorTelp;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}