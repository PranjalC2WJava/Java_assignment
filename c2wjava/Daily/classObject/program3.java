class Demo{

	int x=70;
	String str1="kanha";
	static String str2="kanha";
	String str3=new String("kanha");
	static String str4=new String("kanha");
	public static void main(String[]args){

		Demo obj=new Demo();
		System.out.println(obj.x);
		System.out.println(obj.str1);
		System.out.println(obj.str2);
		System.out.println(obj.str3);
		System.out.println(obj.str4);

	}
}
