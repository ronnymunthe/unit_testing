package informatika.tunjangan;

public class Tunjangan {
	public int tunjanganAnak(int jlhAnak) {
		if (jlhAnak>0) {
			return jlhAnak*1000000;
		}
		else {
			return 0;
		}
	}
	
	public int tunjanganPasangan(boolean status) {
		if (status == false) {
			return 0;
		}
		else {
			return 1000000;
		}
	}
	
	public int totalTunjangan(int a,int b) {
		return a+b;
	}

}
