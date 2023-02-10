
public class bai8 {
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
}
