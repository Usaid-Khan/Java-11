package Localization;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Dates {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Date nowDate = new Date();
		DateFormat dfUS = DateFormat.getDateInstance(DateFormat.FULL, new Locale("en","US"));
		System.out.println("In USA the date format is: " + dfUS.format(nowDate));
		
		DateFormat dfFr = DateFormat.getDateInstance(DateFormat.FULL, new Locale("fr","FRANCE"));
		System.out.println("In France the date format is: " + dfFr.format(nowDate));
		
        DateFormat dfPak = DateFormat.getDateInstance(DateFormat.FULL, new Locale("ur", "PK"));
        System.out.println("In Pakistan the date format is: " + dfPak.format(nowDate));
		
        DateFormat dfCh = DateFormat.getDateInstance(DateFormat.FULL, new Locale("zh", "CN"));
        System.out.println("In China the date format is: " + dfCh.format(nowDate));
	}

}
