package informatika.tunjangan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TunjanganTest {

	@Test
	public void TunjanganAnakTest() {
		Tunjangan tunjangan = new Tunjangan();
		assertEquals(0, tunjangan.tunjanganAnak(0));
	}
	@Test
	public void TunjanganPasanganTest() {
		Tunjangan tunjangan = new Tunjangan();
		assertEquals(1000000, tunjangan.tunjanganPasangan(true));
	}
	@Test
	public void TotalTunjanganTest() {
		Tunjangan tunjangan = new Tunjangan();
		assertEquals(2000000, tunjangan.totalTunjangan(tunjangan.tunjanganAnak(1),tunjangan.tunjanganPasangan(true)));
	}
	
	@Test
	public void TunjanganAnakNegatifTest() {
		Tunjangan tunjangan = new Tunjangan();
		assertEquals(0, tunjangan.tunjanganAnak(-1));
	}
	
	@Test
	public void TunjanganPasanganFalseTest() {
		Tunjangan tunjangan = new Tunjangan();
		assertEquals(0, tunjangan.tunjanganPasangan(false));
	}

}
