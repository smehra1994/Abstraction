package AbstractClass;

//we use extends and not implements as You can only extend one class in your child class, but you can implement as many interfaces as u want.
public class AbstractClassShapeTest extends AbstractClassShape{

	public static void main(String[] args) {
		
		AbstractClassShape s=new AbstractClassShapeTest();
		s.circle();
		s.square();   //can call non abstract methods too so partial abstraction is achieved
		s.rectangle();
	}
	

	@Override        //can't override final methods and here we have 0% abstraction
	void circle() {
		System.out.println("My shape is Circle");
	}

}
