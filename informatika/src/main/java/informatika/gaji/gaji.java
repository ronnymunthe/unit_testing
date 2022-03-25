package org.ifundip.tugasUji;

public class gaji {
	
	public static int jumlahPajak (int gaji) {
		if (gaji >= 0) {
			gaji = gaji*30/100;
		}
		else {
			gaji = 0;
		}
		return gaji;
	}
	
	public static int gajiBersih (int gaji) {
		if (gaji >= 0) {
			gaji = gaji - jumlahPajak(gaji);
		}
		else {
			gaji = 0;
		}
		return gaji;
	}
	
}


