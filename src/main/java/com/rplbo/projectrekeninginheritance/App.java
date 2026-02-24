package com.rplbo.projectrekeninginheritance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RekeningBisnis rb = new RekeningBisnis(new Nasabah("a", "1","jl 1"), 100000);
        rb.penyetoran(100000); // 200rb++
        rb.penarikan(25000); //175rb++
        System.out.println(rb.getSaldo());

        RekeningKeluarga rk = new RekeningKeluarga(new Nasabah("b", "2","jl 2"), 200000);
        rb.penyetoran(100000); //300rb++
        rb.penarikan(25000); //270rb++
        System.out.println(rk.getSaldo());

        RekeningSyariah rs = new RekeningSyariah(new Nasabah("c", "3","jl 3"), 500000);
        rs.penyetoran(150000); //375rb++
        rs.penarikan(25000); //270rb++
        rs.sedekah(30000); //145rb++
        System.out.println(rs.getSaldo());

        RekeningUtama ru = new RekeningUtama(new Nasabah("d", "4","jl 4"), 500000);
        ru.penyetoran(300000); //300rb++
        ru.penarikan(3500000); //375rb++
        System.out.println(ru.getSaldo());

        RekeningTambahan rt = new RekeningTambahan(new Nasabah("e", "4","jl 4"), 500000);
        rt.penyetoran(150000); //375rb++
        rt.penarikan(25000); //375rb++
        System.out.println(rt.getSaldo());
    }
}
