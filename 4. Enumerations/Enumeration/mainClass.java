package Enumeration;

enum WeekDay {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class mainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WeekDay day = WeekDay.Monday;
		switch(day)
		{
		case Monday:
			System.out.println("Monday is the 1st Working Day");
			break;
		case Tuesday:
			System.out.println("Tuesday is the 2nd Working Day");
			break;
		case Wednesday:
			System.out.println("Monday is the 3rd Working Day");
			break;
		case Thursday:
			System.out.println("Monday is the 4th Working Day");
			break;
		case Friday:
			System.out.println("Monday is the 5th Working Day");
			break;
		case Saturday:
			System.out.println("Monday is the 6th Working Day");
			break;
		case Sunday:
			System.out.println("Monday is the 7th Working Day");
			break;
		}
	}

}
