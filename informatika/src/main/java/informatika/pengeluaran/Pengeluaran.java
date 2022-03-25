package org.informatika.pengeluaran;

public class Pengeluaran {
	public int totalPengeluaran(int pengeluaran1, int pengeluaran2) {
		if (pengeluaran1<0) {
			pengeluaran1 = 0;
		}
		else {
			pengeluaran1 = pengeluaran1;
		}
		if (pengeluaran2<0) {
			pengeluaran2 = 0;
		}
		else {
			pengeluaran2 = pengeluaran2;
		}
		return pengeluaran1 + pengeluaran2;
	}
	
	public int sisaTabungan (int totalPengeluaran, int gajiBersih, int totalTunjangan){
		return gajiBersih + totalTunjangan - totalPengeluaran;
	}
}
