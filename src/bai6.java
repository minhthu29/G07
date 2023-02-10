
public class bai6 {
	static boolean kiemtrasonguyento(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	static void songuyentodautien(int n)
	{
		 int dem = 0; // dem tong so nguyen to
		 int i = 2;   // tim so nguyen to bat dau tu so 2
		   while (dem < n) {
		        if (kiemtrasonguyento(i)) {
		            System.out.printf("%d", n);
		            dem++;
		        }
		        i++;
		    }
	}
	
}
