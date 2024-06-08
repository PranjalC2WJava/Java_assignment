import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter name:");
		 String name=sc.next();

		 System.out.println("Enter grade:");
		 char grade=sc.next().charAt(0);

		 System.out.println("Enter salary:");
		 double sal=sc.nextDouble();

		 System.out.println("Name:"+name);
		 System.out.println("grade:"+grade);
		 System.out.println("sal:"+sal);
	}
}
