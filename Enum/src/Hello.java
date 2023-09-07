import java.lang.reflect.Array;

public class Hello {

	public static void main(String[] args) {
		 //intializing an enum
		
		 //int  arr[] = {1, 2};
//		String arr[] = {"ram", "ravan"};
		 
		Learning learn = Learning.SPRING;
		switch(learn) {
		 case COLLECTIONS:
			 System.out.println("step2 to learn this part");
		    break;
		 case COREJAVA:
			 System.out.println("step1 to learn this part");
		    break;
		 case GENERICS:
			 System.out.println("step3 to learn this part");
		    break;
		 case JSPANDSERVLETS:
			 System.out.println("step4 to learn this part");
		    break;
		 case SPRING:
			 System.out.println("step5 to learn this part");
		    break;
		 default:
			 System.out.println("step6 to cover everything");
		    break;
		
		}

	}

}
