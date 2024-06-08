// print countdown of numbers
class Day{

	public static void main(String[]args){

		int day=7;
		while(day>=1){

			if(day==0){

				System.out.println(day+" days Assignment is overdue");


			}else{

				System.out.println(day +" days remaining");
			}

			day--;
		}
	}
}
