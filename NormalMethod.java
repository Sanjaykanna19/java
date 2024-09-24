package first;

public class NormalMethod {
	static int a=10;
	static int b=20;
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	static void staticDisplay()
	{
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		NormalMethod nm=new NormalMethod();
		nm.display();
		//nm.staticDisplay();//no need to call the object explicitly
		staticDisplay();
	}

}
