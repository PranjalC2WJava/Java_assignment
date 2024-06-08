 import java.io.*;
 class Demo{

	 public static void main(String[]args)throws IOException{

		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("Enter name");
		 String name=br.readLine();

		 System.out.println("Enter employee grade:");
		 char grade=(char)br.read();

		 br.skip(1);

		 System.out.println("Employee salary:");
		 double sal=Double.parseDouble(br.readLine());

		 System.out.println("Name:"+name);
		 System.out.println("Garde:"+grade);
		 System.out.println("sal:"+sal);
		 
	 }
 }
