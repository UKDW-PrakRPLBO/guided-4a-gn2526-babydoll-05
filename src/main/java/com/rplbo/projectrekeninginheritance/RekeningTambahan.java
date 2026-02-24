package com.rplbo.projectrekeninginheritance;

public class RekeningTambahan extends RekeningKeluarga{
    public RekeningTambahan(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningTambahan(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    @Override
    public void penarikan(int jumlah) {
        if (jumlah < 500000){
            super.penarikan(jumlah);
        }
    }
}