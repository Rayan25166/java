import java.util.Scanner;
public class duster {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First number(a)");
		int a=sc.nextInt();
		System.out.println("Second number(b)");
		int b=sc.nextInt();
		System.out.println("Before swapping a="+a + ",b="+b);
		

		int temp=a;
		 a=b;
		 b=temp;
		 System.out.println("After swapping a="+a + ",b="+b);
		 sc.close();
		
	}

}
