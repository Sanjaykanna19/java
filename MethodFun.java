package first;

public class MethodFun {
	//using static method we must create object
	private static int getSquare (int x){
		return x*x;
		
	}

	public static void main(String[] args) {
		
		//access modifier return type funname(int,int,string)
		//public void func(int,int);
		//void func(double);
		//void func(int);
		for(int i=1;i<=5;i++) {
			
		
		// direct method 

			
	int result=getSquare(i);
	System.out.println("square of i "+i+" "+result);		
	}
			
			
			
		//Method call using object
//			MethodFun mf=new MethodFun();
//			MethodFun.getSquare(i);
		//second var of method to print the method
//			int result=mf.getSquare(i);
//			System.out.println("the value is "+result);
				
		}
		}


