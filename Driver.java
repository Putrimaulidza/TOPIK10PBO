package com.Topik10;

public class Driver extends Member{
    String platKendaraan;
    String jenisKendaraan;

    public Driver(String NIK, String nama, String nomorTelp, double saldo, String platKendaraan, String jenisKendaraan) {
        super(NIK, nama, nomorTelp, saldo);
        this.platKendaraan = platKendaraan;
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getPlatKendaraan() {
        return platKendaraan;
    }

    public void setPlatKendaraan(String platKendaraan) {
        this.platKendaraan = platKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }
}
