
public class bai10 {
	static long fibonacci(int x) {	
		if(x == 0)
	        return 0;
	        else if (x == 1)
	        return 1;
	    return fibonacci(x-1) + fibonacci(x-2);
	    
	    }
	
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
	
	static void fibonacci_sont(int n) {
	     int i = 0;
	     while (fibonacci(i) < n) {
	         int fi = (int) fibonacci(i);
	         if (kiemtrasonguyento(fi)) {
	             System.out.printf("%d ", fi);
	         }
	         i++;
	     }

	     }
	     }

