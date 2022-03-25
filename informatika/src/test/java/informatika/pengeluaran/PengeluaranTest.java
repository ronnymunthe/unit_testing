package org.informatika.pengeluaran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PengeluaranTest {

	@Test
	public void totalPengeluarantest() {
		Pengeluaran pengeluaran = new Pengeluaran();
		assertEquals(1000000, pengeluaran.totalPengeluaran(500000, 500000));
	}
	
	@Test
	public void totalPengeluaranNegativetest() {
		Pengeluaran pengeluaran = new Pengeluaran();
		assertEquals(0, pengeluaran.totalPengeluaran(-1, -1));
	}
	
	@Test
	public void sisaTabungantest() {
		Pengeluaran pengeluaran = new Pengeluaran();
		assertEquals(1000000, pengeluaran.sisaTabungan(500000, 1000000, 500000));
	}

}
