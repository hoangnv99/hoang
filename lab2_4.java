import java.util.Scanner;

public class lab2_4{
public static void giaiPTB1(){
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
public static void giaiPTB2(){

   
	Scanner input = new Scanner(System.in);
	System.out.println("Nhap vao He So PT Bac 1 Ax^2+Bx+C=0");
	System.out.print("a =");
	int a = input.nextInt();
	System.out.print("b = ");
	int b = input.nextInt();
	System.out.print("c =");
	int c = input.nextInt();
	if(a==0)
	   { 
		if(b==0)
	   	{ if(c==0)
			{ System.out.println("PT co VSN"); }
	    	 else
			{ System.out.println("PT Vo Nghiem"); }	
	  	 }
		else
		{
	   
			int x= -c/b;
			System.out.print("Nghiem cua PT la: "+x);
	   
		}	
	   }
	else
	{
	   int delta = b*b-4*a*c;
	   Double candelta = Math.sqrt(delta);
	   if( delta < 0){System.out.println("PT Vo Nghiem");}
	   if( delta == 0 )
		{
			int x = -b/(2*a);
			System.out.println("PT Co Nghiem Kep X="+x);
		}
	   else{
			int m = 2*a;
			Double x1 = (-b+candelta)/m;
			Double x2 = (-b-candelta)/m;
			System.out.println("PT Co 2 Nghiem Phan Biet La X1= "+x1+" Va X2 = "+x2);	
		}
	}	
   }


   public static void tinhtiendien()
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

   public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("+--------------------------------+ ");
	System.out.println("Nhap Vao 1 de Giai PT B1: ");
	System.out.println("Nhap Vao 2 de Giai PT B2: ");
	System.out.println("Nhap Vao 3 de Tinh Tien Dien: ");
	System.out.println("Nhap Vao 4 de Ket Thuc  : ");
	System.out.println("+--------------------------------+ ");
	int luachon = input.nextInt();
	switch(luachon){
	   case 1:
		giaiPTB1();
		break;
	   case 2:
		giaiPTB2();
		break;
	   case 3:
		tinhtiendien();
		break;
	   case 4:
		System.out.print("Ket Thuc ");
		break;
	}
   }
}