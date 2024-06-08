class DivDemo{
    public static void main(String[]args){
      int num=15;
      if(num%3==0){
        System.out.println(num+" is divisible by 3");
      }
      else if(num%7==0){
     System.out.println(num+" is divisible by 7");
      
      }

      else if(num%7==0 && num%3==0){
     System.out.println(num+" is divisible by both 3 and 7");
      }
      else{
	      System.out.println(num+" is neither divisible by 3 nor by 7");
      }
    }
}
