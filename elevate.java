import java.util.Scanner;
public class elevate {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("The number is positive");
		}
		else if(n%2!=0) {
					System.out.println("The number is negative");
					
				}
				else {
					System.out.println("The number is zero");
				}
	}

}
