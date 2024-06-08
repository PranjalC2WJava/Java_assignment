//print numbers divisible by 4 nd 7 between 50-100
class Num{

	public static void main(String[]args){

		int i=50;
		while(i<=100){

			
			if(i%4==0 && i%7==0){

				System.out.println(i);

			}
			i++;

		}

	}
}
