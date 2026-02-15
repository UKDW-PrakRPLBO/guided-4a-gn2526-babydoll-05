package com.rplbo.projectrekeninginheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void testAll(){

        RekeningBisnis rb1 = new RekeningBisnis(new Nasabah("anton","123","jl jalan"),10000);
        rb1.penyetoran(2000);
        rb1.penarikan(500);
        assertEquals(11502,rb1.getSaldo());

        RekeningKeluarga rk1 = new RekeningKeluarga(new Nasabah("budi","124","jl jalan 2"),10000);
        rk1.penyetoran(2000);
        rk1.penarikan(500);
        assertEquals(11502,rb1.getSaldo());

        RekeningSyariah rs1 = new RekeningSyariah(new Nasabah("gun","125","jl jalan 3"),1000000);
        rs1.penyetoran(200000);
        rs1.penarikan(110000);
        rs1.sedekah(100000);
        String expected = "Sedekah: 100000";
        assertEquals(expected,outputStreamCaptor.toString().trim());

        RekeningUtama ru1 = new RekeningUtama(new Nasabah("bapak","125","jl jalan 3"),5000000);
        ru1.penyetoran(1000000);
        ru1.penarikan(3500000);
        ru1.penarikan(500000);
        assertEquals(5500000,ru1.getSaldo());

        RekeningTambahan rt1 = new RekeningTambahan(new Nasabah("anak","126","jl jalan 3"),5000000);
        rt1.penyetoran(1000000);
        rt1.penarikan(600000);
        rt1.penarikan(200000);
        assertEquals(5800000,rt1.getSaldo());
    }
}
