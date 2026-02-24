package com.rplbo.projectrekeninginheritance;

public class RekeningSyariah extends Rekening{


    public RekeningSyariah(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    @Override
    public void penarikan(int jumlah) {
        int total = 0;
        if (jumlah > 1000000){
            total = jumlah + 1000;
        } else {
            total = jumlah;
        }
        super.penarikan(total);
    }

    public void sedekah(int jumlah){
        System.out.println("Sedekah: " + jumlah);
        super.penarikan(jumlah);
    }

}