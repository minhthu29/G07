
public class bai5 {
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
 static void songuyento(int n) {
     if (n >= 2) {
         System.out.print(2);
     }
     for (int i = 3; i < n; i+=2) {
         if (kiemtrasonguyento(i)) {
             System.out.print(" " + i);
         }
     }
 }
}
