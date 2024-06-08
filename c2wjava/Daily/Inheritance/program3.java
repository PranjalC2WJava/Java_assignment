class Parent{

	int x=10;
	Parent(){

		System.out.println("Parent constructor");
	}
	void fun(){


		System.out.println("In fun-parent");

	}
}
class child extends Parent{

	int x=20;
	child(){

		System.out.println("child constructor");
		System.out.println(x);
		System.out.println(super.x);
	}
	void fun(){

		System.out.println("in fun-child");
		super.fun();
	}


}
class Client{

	public static void main(String[]args){


		child obj=new child();
		//System.out.println(obj.x);
		obj.fun();
	}
	
}


