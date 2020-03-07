import java.util.Scanner;

public class lab2_3{
   public static void main(String[] args)
   {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhap vao He So Dien Su Dung: ");
	int x = input.nextInt();
	if(x > 0 & x <=50)
	{
		int Money = x *1000;
		System.out.println("Tong So Tien la : "+Money);

	}
	else
	{
		int Money2 = 50*1000+(x-50)*1200;
		System.out.print("Tong So tien la: "+Money2);
	}
   }
}