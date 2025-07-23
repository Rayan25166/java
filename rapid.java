import java.util.Scanner;
class student{
	String name;
	int age;
	void displaydetails() {
		System.out.println("Name"+name);
		System.out.println("Age"+age);
		
	}
}
			
public class rapid {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in); 
		student student1=new student();
		System.out.println("Enter the name");
		student1.name=sc.nextLine();
		System.out.println("Enter the age");
		student1.age=sc.nextInt();
		System.out.println("/nStudent details:");
		
	}

}
