
public class WeekDayMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(WeekDay day : WeekDay.values())
		{
			System.out.println("Today is: " + day + " Which is day: " + day.checkSpecification());
		}
	}
}
