class Demo{

	int x=10;
	int y=20;
	Demo(int x,int y){
 
		System.out.println("In Constructor");

	
		System.out.println(x);
		System.out.println(y);
		this.x=x;
		this.y=y;
}
             void printData(){

		System.out.println(x);
		System.out.println(y);
		
	     }
}
class client{

	public static void main(String[]args){

		Demo obj=new Demo(30,40);
		obj.printData();
	}
}

