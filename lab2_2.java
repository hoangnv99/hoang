import java.util.Scanner;

public class lab2_2{
   public static void main(String[] args)
   {
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
}