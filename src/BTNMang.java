
public class BTNMang {
	/**
	 * tính tổng của các pt trong mảng
	 * @param mang Mảng cần tính 
	 * @return Tổng các pt
	 */
	public static float Tong(float[] mang) {
		int n = mang.length;
		float s = 0;
		for(int i = 0; i < n; i++) {
			s = s + mang[i];
		}
		return s;	
	}
	/**
	 * tim min, max, average của mảng
	 * @param  Mảng đầu vào
	 * @return Mảng lưu n3 giá trị: Min, Max, Average.
	 */
	public static float[] MinMaxAve (float[] mang) {
		float[] mma = new float[3];
		mma[0] = min(mang);
		mma[1] = max(mang);
		mma[2] = average(mang);
		return mma;
	
	}
	static float min(float[] mang) {
		
		float m = mang[0];
		for (int i = 0; i < mang.length; i++) 
			if(m < mang[i]) 
				m = mang[i];
		return m;	
		
	}
	static float max(float[] mang) {
		
		float m = mang[0];
		for (int i = 0; i < mang.length; i++) 
			if(m > mang[i]) 
				m = mang[i];
		return m;	
		
	}
	static float average(float[] mang) {
		
		float s = mang[0];
		for (int i = 0; i < mang.length; i++) 
			s += mang[i];
		float ave = s/mang.length;
		return ave;	
		
	}
	/**
	 * tính tổng các số nguyên tố trong mảng
	 * @param mang mảng đầu vào
	 * @return tổng các số nguyên tố
	 */
	public static float TongNguyenTo(float[] mang) {
		float s = 0;
		for (int i = 0; i < mang.length; i++) 
			if(kiemtrasonguyento(mang[i]))
				 s = s + i;
		return s;	
	}
	static boolean kiemtrasonguyento(float a) {
        // so nguyen n < 2 khong phai la so nguyen to
		int n = (int) a;
        if (n == a) {
        	if (n < 2)
        		return false;
        	
        	int d = (int) Math.sqrt(n);
        	for (int i = 2; i<=d; i++)
        		if (n % i == 0) {
                    return false; 
        }
         return true;  
        }
		return false;
	}
}	       
	

