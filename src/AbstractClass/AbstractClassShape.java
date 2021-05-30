package AbstractClass;

public abstract class AbstractClassShape {
	
	int color;
	
	//unlike interface where we can define abstract methods only , here we can define both abstarct and non abstract methods
	abstract void circle();
	
	public void square()
	{
		System.out.println("My Shape is Square");
	}
	
	public final void rectangle()
	{
		System.out.println("My Shape is rectangle");
	}

}
