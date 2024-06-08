class Demo{

	int x=10;
	String str=new String("pranjal");
        static int y=20;
	public static void main(String[]args){


		int a=30;
		int b=30;
		String str1=new String("pranjal");
		Demo  obj=new Demo();
		System.out.println(obj.x);
		System.out.println(obj.str);
		System.out.println(y);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(a);
		System.out.println(b);
		System.out.println(str1);
	}
}
