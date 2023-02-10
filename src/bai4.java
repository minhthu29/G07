
public class bai4 {
	static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
	  static int BSCNN(int a, int b) {
	        return (a * b) / USCLN(a, b);
	    }
}
