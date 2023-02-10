
import java.lang.Math;
public class N203 {
	static void menu()
	{
		
		
		System.out.print("\n [1]Tim nghiem phuong trinh bac hai:            ");
		System.out.print("\n [2]Tinh giai thua:                             ");
		System.out.print("\n [3]Tim so fibonacci thu n:                     ");
		System.out.print("\n [4]Tim UCLN va BBNN cau 2 so a va b:           ");
		System.out.print("\n [5]Liet ke cac so nguyen to nho hon n:         ");
		System.out.print("\n [6]Liet ke n so nguyen to dau tien:            ");
		System.out.print("\n [7]Liet ke cac so nguyen to co 5 chu so:       ");
		System.out.print("\n [8]Tinh tong cac chu so nguyen:                ");
		System.out.print("\n [9]Liet ke cac so thuan nghich co 6 chu so:    ");
		System.out.print("\n [10]Liet ke cac so fibonacci nho hon n la so nguyen to:       ");
	
	}
	

	
	
	
	
	static void ptbac2(float a, float b, float c) {
		System.out.print("PHUONG TRINH BAC 2");
		System.out.print("\n");
		float d = b*b - 4*a*c;
		//float d = Math.pow(b, 2) - 4*a*c
		float x1, x2;
		if(d>0) {
			x1 = (float)((-b + Math.sqrt(d)) / (2*a));
			x2 = (float)((-b - Math.sqrt(d)) / (2*a));
			System.out.print("pt co nghiem x1 = ");System.out.print(x1);System.out.print("\n");
			System.out.print("pt co nghiem x2 = ");System.out.print(x2);
			System.out.print("\n");
		}else if(d == 0) {
			x1 = (-b/(2*a));
			System.out.print("pt co nghiem kep x1 = x2 =  ");System.out.print(x1);System.out.print("\n");
		}else
			System.out.print("pt vo nghiem.");}
	
	
	
	   
	static long giaithua(int n) {
		if (n == 0) {
	        return 1;
	    } else {
	        return  n * giaithua(n - 1);
	    }
	}
		
	static long fibonacci(int x) {	
	if(x == 0)
        return 0;
        else if (x == 1)
        return 1;
    return fibonacci(x-1) + fibonacci(x-2);
    
    }
	
	 static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
	  static int BSCNN(int a, int b) {
	        return (a * b) / USCLN(a, b);
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
     public static int tinhTong(long i){
         int sum=0;
         long n;
         while(i!=0){
             n= i%10;
             sum+= n;
             i/=10;
         }
         return (sum);
     }
   /*  public static void main(String[] args){
                 System.out.print("Nhap n");
         int n= nhap();
         System.out.println("Tong cua so "+n+" = " +tinhTong(n));
     }*/
     public static boolean testSoThuanNghich(int n){
         StringBuilder xau= new StringBuilder();
         String str= ""+n;
         xau.append(str);
         String check= ""+xau.reverse();
         if(str.equals(check)) return true;
         else return false;
     }
    /* public static void main(String[] args) {
   
         int n,count=0;
         for(n=100000 ; n<= 999999 ; n++){
             if(testSoThuanNghich(n)){
                 System.out.println(n);count++;
             }
         }
         System.out.println("Co "+count+" so thuan nghich co 6 chu so");
    
     }*/
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

	

