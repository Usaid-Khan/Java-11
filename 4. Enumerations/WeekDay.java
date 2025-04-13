public enum WeekDay {
	Monday("one"),
	Tuesday("two"),
	Wednesday("three"),
	Thursday("four"),
	Friday("five"),
	Saturday("six"),
	Sunday("seven");
	String DaySpecify;
	
	WeekDay(String n)
	{
		this.DaySpecify=n;
	}
	public String checkSpecification()
	{
		return this.DaySpecify;
	}
}