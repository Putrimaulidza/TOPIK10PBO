package com.Topik10;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Driver> drvr = new ArrayList<>();
    static ArrayList<Customer> cstmr = new ArrayList<>();
    static Scanner member = new Scanner(System.in);


    public static void main(String[] args) {
        int opsi;
        do {
            System.out.println("1.Input Driver");
            System.out.println("2.Input Customer");
            System.out.println("3.Info Driver");
            System.out.println("4.Info Customer");
            System.out.println("5.Top up saldo Customer");
            System.out.println("6.Transaksi/Pembayaran Jasa Pengantaran");
            System.out.println("7.Keluar");
            System.out.println("Masukkan Pilihan");
            opsi = member.nextInt();

            switch (opsi) {
                case 1:
                    inputDriver();
                    break;
                case 2:
                    inputCustomer();
                    break;
                case 3:
                    infoMemberDriver();
                    break;
                case 4:
                    infoMemberCustomer();
                    break;
                case 5:
                    topUpSaldoCustomer();
                    break;
                case 6:
                    bayarDriver();
                    break;
                case 7:
                    System.out.println("===PROGRAM TELAH SELESAI===");
                    break;
                default:
                    System.out.println("!!! TIDAK ADA OPSI, SILAHKAN DIULANG KEMBALI!!!\n");
                    break;
            }
        } while (opsi != 7);
    }

    static void inputDriver() {
        String nik, nama, nomorTelp, platKendaraan, jenisKendaraan;
        double saldo;

        System.out.println("NIK :");
        nik = member.next();
        System.out.println("Nama :");
        nama = member.next();
        System.out.println("Nomor Telp :");
        nomorTelp = member.next();
        System.out.println("Saldo :");
        saldo = member.nextDouble();
        System.out.println("Plat Kendaraan");
        platKendaraan = member.next();
        System.out.println("Jenis Kendaraan");
        jenisKendaraan = member.next();

        drvr.add(new Driver(nik, nama, nomorTelp, saldo, platKendaraan, jenisKendaraan));
        System.out.println();
    }

    static void inputCustomer() {
        String nik, nama, nomorTelp;
        double saldo;

        System.out.println("NIK :");
        nik = member.next();
        System.out.println("Nama :");
        nama = member.next();
        System.out.println("Nomor Telp :");
        nomorTelp = member.next();
        System.out.println("Saldo :");
        saldo = member.nextDouble();
        cstmr.add(new Customer(nik, nama, nomorTelp, saldo));
        System.out.println();
    }

    private static void infoMemberDriver() {
        for (Driver driver : drvr) {
            System.out.println("NIK :" + driver.getNIK()
                    + "\nNama : " + driver.getNama()
                    + "\nNomor Telp :" + driver.getNomorTelp()
                    + "\nSaldo :" + driver.getSaldo()
                    + "\nNomor Plat Kendaraan:" + driver.getPlatKendaraan()
                    + "\nJenis Kendaraan :" + driver.getJenisKendaraan() + "\n");
        }
        System.out.println();
    }

    static void infoMemberCustomer() {
        for (Customer customer : cstmr) {
            System.out.println("NIK :" + customer.getNIK()
                    + "\nNama :" + customer.getNama()
                    + "\nNomor Telp :" + customer.getNomorTelp()
                    + "\nSaldo :" + customer.getSaldo() + "\n");
        }
        System.out.println();
    }

    static void topUpSaldoCustomer() {
        int indexCustomer, indexDriver;
        double topUp;

        System.out.println("Masukkan index customer :");
        indexCustomer = member.nextInt();
        System.out.println("Masukkan index driver :");
        indexDriver = member.nextInt();
        System.out.println("Jumlah saldo yang akan ditop up :");
        topUp = member.nextDouble();

        drvr.get(indexDriver).saldo -= topUp;
        cstmr.get(indexCustomer).saldo += topUp;

        System.out.println("Transaksi berhasil yeay!. \n");
    }

    static void bayarDriver() {
        int indexCustomer;
        int indexDriver;
        double bayar;

        System.out.println("Masukkan index driver : ");
        indexDriver = member.nextInt();
        System.out.println("Masukkan index customer : ");
        indexCustomer = member.nextInt();
        System.out.println("Jumlah saldo yang akan ditop up :");
        bayar = member.nextDouble();

        cstmr.get(indexDriver).saldo -= bayar;
        drvr.get(indexCustomer).saldo += bayar;

        System.out.println("Transaksi berhasil!!. \n");
    }
}