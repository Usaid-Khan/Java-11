package Custom_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@Retention(RetentionPolicy.RUNTIME)    //giving the annotation to JVM
@Target(ElementType.METHOD)        //restricting it to only methods
@interface PrintInterface {
	int priority() default 1;
	String description();
}

class PrintingClass {
	@PrintInterface(description = "It is printing C++", priority = 1)
	public void Printer1()
	{
		System.out.println("Hey Java");
	}
	@PrintInterface(description = "It is printing Java", priority = 2)
	public void Printer2()
	{
		System.out.println("Hey Java");
	}
	@PrintInterface(description = "It is printing Python", priority = 3)
	public void Printer3()
	{
		System.out.println("Hey Java");
	}
	
	public void Printer4()
	{
		System.out.println("Hey Java");
	}
}

public class WithElements{

	public static void main(String[] args)
	{
		Class<PrintingClass> obj = PrintingClass.class;
		
		/*Printing all methods*/
		for(Method element : obj.getDeclaredMethods())
		{
			System.out.println(element.getName());
		}
		System.out.println();
		
		/*Printing only annotation methods*/
		for(Method element : obj.getDeclaredMethods())
		{
			if(element.isAnnotationPresent(PrintInterface.class))
			{
				PrintInterface annotation = element.getAnnotation(PrintInterface.class);
				System.out.println("Method with Annotation: " + element.getName() + " and has priority of " + annotation.priority());
			}
		}
		System.out.println();

		/*Printing annotation methods by their priority */
		ArrayList<Method> list = new ArrayList<>();
		for(Method element : obj.getDeclaredMethods())
		{
			if(element.isAnnotationPresent(PrintInterface.class))
			{
				list.add(element);
			}
		}
		
		// Sort the list based on priority
		Collections.sort(list, new Comparator<Method>() {
			@Override
			public int compare(Method m1, Method m2) {
				PrintInterface a1 = m1.getAnnotation(PrintInterface.class);
				PrintInterface a2 = m2.getAnnotation(PrintInterface.class);
				return Integer.compare(a1.priority(), a2.priority());
			}
		});
		
		// Print the methods in sorted order
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Annotation method with priority " + (i+1) + ": " + list.get(i).getName());
		}
	}
}
