package Custom_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)    //giving the annotation to JVM
@Target(ElementType.METHOD)        //restricting it to only methods
@interface Print2 {
	int priority() default 1;
	String description();
	
}

class Printing {
	@Print2(description = "It is printing C++", priority = 1)
	public void Printer1()
	{
		System.out.println("Hey Java");
	}
	@Print2(description = "It is printing Java", priority = 2)
	public void Printer2()
	{
		System.out.println("Hey Java");
	}
	@Print2(description = "It is printing Python", priority = 3)
	public void Printer3()
	{
		System.out.println("Hey Java");
	}
	
	public void Printer4()
	{
		System.out.println("Hey Java");
	}
}

public class WithoutElement{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Class<Printing> obj = Printing.class;
		
		/*Printing only annotation methods*/
		for(Method element : obj.getDeclaredMethods())
		{
			Print2 annObj = element.getAnnotation(Print2.class);
			if(element.isAnnotationPresent(Print2.class))
			{
				System.out.println("Method with Annotation: " + element.getName() + " Has Priority: " + annObj.priority() + " and " + annObj.description());
			}
		}
	}
}
