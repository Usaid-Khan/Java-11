package Localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Parsing {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String ds = "September 03, 2024";
		String num = "12345.37";
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);
		NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
		try
		{
			Date d = sdf.parse(ds);
			Number n = nf.parse(num);
			
			System.out.println("Parsed date is: " + d);
			System.out.println("Parsed number is: " + n);
		}
		catch(ParseException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
