class Demo{

	static char ch1='A';
	char ch2='B';

	void method1(){

		System.out.println(Demo.ch1);

		System.out.println(ch2);
	}
	public static void main(String[]args){

		Demo obj=new Demo();
		obj.method1();
	}
}
