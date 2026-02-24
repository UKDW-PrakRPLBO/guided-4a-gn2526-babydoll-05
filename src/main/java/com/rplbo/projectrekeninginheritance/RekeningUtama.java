package com.rplbo.projectrekeninginheritance;

public class RekeningUtama extends RekeningKeluarga{
    public RekeningUtama(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningUtama(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    @Override
    public void penarikan(int jumlah) {
        if (jumlah < 3000000){
            super.penarikan(jumlah);
        }
    }
}
