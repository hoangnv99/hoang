import java.util.Scanner;

public class lab2_1{
   public static void main(String[] args)
   {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhap vao He So PT Bac 1 Ax+b=0");
	System.out.print("a =");
	int a = input.nextInt();
	System.out.print("b = ");
	int b = input.nextInt();
	if(a==0)
	   { if(b==0)
		{ System.out.println("PT co VSN"); }
	     else
		{ System.out.println("PT Vo Nghiem"); }	
	   }
	else
	{
	   
		int x= -b/a;
		System.out.print("Nghiem cua PT la: "+x);
	   
	}	
   }
}