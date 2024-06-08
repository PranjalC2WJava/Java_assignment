  class imutableDemo{


	  public static void main(String []args){


		  String str1="Pranjal";
		  String str2="Pranjal";
	 	  System.out.println(System.identityHashCode(str1));
		  System.out.println(System.identityHashCode(str2));
		  str1=str1+"Shirke";
		  System.out.println(System.identityHashCode(str1));
		  System.out.println(System.identityHashCode(str2));
	  }
  }
