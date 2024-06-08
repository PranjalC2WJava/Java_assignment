class StringDemo{

	public static void main(String[]args){

		String str1="Pranjal";
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		String str2="Pranjal";
           	System.out.println(str2);
		System.out.println(System.identityHashCode(str2));

	        String str3=new String("Pranjal");
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));


		String str4=new String("Pranjal");
		System.out.println(str4);
		System.out.println(System.identityHashCode(str4));
		
	}
}
