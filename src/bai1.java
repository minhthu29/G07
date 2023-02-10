
public class bai1 {
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
	
	
}
