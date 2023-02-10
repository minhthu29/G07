
public class bai2 {
	static int giaithua(int n) {
		if (n == 0) {
	        return 1;
	    } else {
	        return  n * giaithua(n - 1);
	    }
		
	}
	
}
