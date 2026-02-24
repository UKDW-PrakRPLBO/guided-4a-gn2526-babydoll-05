package com.rplbo.projectrekeninginheritance;

public class RekeningBisnis extends Rekening {

    public RekeningBisnis(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningBisnis(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    @Override
    public void penyetoran(int jumlah) {
        int total = jumlah + bunga(jumlah);
        super.penyetoran(total);
    }


    private int bunga(int jumlah) {
        return (int) (jumlah + 0.1/100);
    }
}

