import java.io.*;
class Demo{

	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows:");
		int row=Integer.parseInt(br.readLine());

		int num=row;
	
		for(int i=1;i<=row;i++){
	

			for(int j=1;j<=row-i+1;j++){

				System.out.print(num+" ");
			}
			System.out.println(" ");
		        num--;
		}
	}
}
