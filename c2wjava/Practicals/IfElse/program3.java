 class IfDemo{

    public static void main(String[]args){
       int num=13;

       if(num%2==0 && num>10){
      System.out.println(num+" is an even number and greater than 10");

       } 
       else if(num%2==0 && num<10){
      System.out.println(num+" is an even number and less than 10");

       }
       else if(num>10){
       System.out.println(num+ " is odd and greater than 10");
      }
      else if(num<10){
	      
       System.out.println(num+ " is odd and less than 10");
      }
      else{


       System.out.println(num+ " is equal to 10");
      }
      }
          
      }
   
 
