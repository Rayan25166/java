class Student{
	int rollno;
	String name;
	int m1,m2,m3;
	float avg;
	Student(int rollno,String name,int m1,int m2,int m3){
		this.rollno=rollno;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	public void calculateaverage() {
		avg=(m1+m2+m3)/3;
	
		
	}
	public void Displaydetails() {
		System.out.println("Roll number:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Mark1:"+m1+"Mark2:"+m2+"Mark3:"+m3);
		System.out.println("Average:"+avg);
		
	}
}
public class Camry {
	public static void Main(String[]  args) {
		
		Student student1 = new Student(12,"Rayan",10,13,15);
		Student student2 = new Student (10,"Albin",10,19,18);
		student1.calculateaverage();
		student1.Displaydetails();
		
		
		 
	}

}
