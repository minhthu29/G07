import java.util.*;
public class Main {

@SuppressWarnings("resource")
public static void main(String[] args) {
	float[] a = {1, 4, 3, 5, 6, 4};
	float b[] ;
	b = new float[5];
	b[0] = 1;
	b[2] = 5;
	b[3] = 8;
	
	
	float sA = BTNMang.Tong(a);
	float sB = BTNMang.Tong(b);
	System.out.printf("\n SA = %f", sA);
	System.out.printf("\n SA = %f", sB);
	
	System.out.printf("\n min = %f", BTNMang.min(a));
	System.out.printf("\n max = %f", BTNMang.max(a));
	System.out.printf("\n average = %f", BTNMang.average(a));
	
	
	float[] ks = BTNMang.MinMaxAve(a);
	System.out.printf("\n min = %4f, max = %4f, ave = %4f", ks[0], ks[1], ks[2]);

	
	System.out.printf("\n tong = %f", BTNMang.TongNguyenTo(a));
	
}
}
			/*Scanner input = new Scanner(System.in);
			boolean lc = true;
			do {
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
				int chon = input.nextInt();
				switch (chon) {
				case 1:
					System.out.print("nhap a, b, c :");
					int a = input.nextInt();
					int b = input.nextInt();
					int c = input.nextInt();
					bai1.ptbac2(a, b, c);
					break;
				case 2:
					int n = input.nextInt();
					bai2.giaithua(n);
					
			        for (int i = 0; i < n; i++) {
			            System.out.print(giaithua(i) + " ");
			        }
					break;
				case 3:
					int x = input.nextInt();
					bai3.fibonacci(x);
					System.out.println("  dãy số fibonacci: ");
			        for (int i = 0; i < x; i++) {
			            System.out.print(fibonacci(i) + " ");
			        }
					break;
				case 4:
					int a1 = input.nextInt();
					int b1 = input.nextInt();
					bai4.BSCNN(a1, b1);
					System.out.println("BSCNN cua  "+a1+b1+" la " +bai4.BSCNN(a1, b1));
					bai4.USCLN(a1, b1);
					System.out.println("USCLN cua "+a1+b1+" la " +bai4.USCLN(a1, b1));
					break;
				case 5:
					int n1 = input.nextInt();
					bai5.songuyento(n1);;
					break;
				case 6:
					int n2 = input.nextInt();
					bai6.songuyentodautien(n2);;
					break;
				case 7:
					int n3 = input.nextInt();
					bai7.sontco5so(n3);;
					
					break;
				case 8:
					 System.out.print("Nhap n :");
			         int n4= input.nextInt();
			         System.out.println("Tong cua so "+n4+" = " +bai8.tinhTong(n4));
					break;
				case 9:
					int n6 = input.nextInt();
					bai9.testSoThuanNghich(n6);
					break;
				case 10:
					int n5 = input.nextInt();
					bai10.fibonacci_sont(n5);
					break;
				default:
					
					lc = false;
					break;
				}
			} while (lc);
		}

private static int nhap() {
	// TODO Auto-generated method stub
	return 0;
}

private static String fibonacci(int i) {
	// TODO Auto-generated method stub
	return null;
}

private static String giaithua(int i) {
	// TODO Auto-generated method stub
	return null;
}*/

	

