package org.ifundip.tugasUji;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class gajiTest {

	private gaji gaji1;
	@BeforeEach
	public void setGaji() {
		gaji1 = new gaji();
	}
	@Test
	@DisplayName("testing jumlah wajib pajak")
	void testJumlahPajak() {
		assertEquals(30,gaji.jumlahPajak(100));
	}

	@Test
	@DisplayName("testing jumlah gaji setelah bayar pajak")
	void testGajiBersih() {
		assertEquals(70,gaji.gajiBersih(100));
	}
	
	@Test
	@DisplayName("testing jumlah pajak negatif")
	void testJumlahPajak0() {
		assertEquals(0,gaji.jumlahPajak(-1));
	}
	
	@Test
	@DisplayName("testing jumlah gaji bersih negatif")
	void testGajiBersih0() {
		assertEquals(0,gaji.gajiBersih(-1));
	}
	
}
