package Localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundles {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Locale pakLang = new Locale("urdu", "Pakistan");
		Locale usLang = new Locale("en", "USA");
		Locale frLang = new Locale("fr", "France");
		Locale grLang = new Locale("gr", "Germany");
		
		ResourceBundle rbUrdu = ResourceBundle.getBundle("Message", pakLang);
		ResourceBundle rbUS = ResourceBundle.getBundle("Message", usLang);
		ResourceBundle rbFrench = ResourceBundle.getBundle("Message", frLang);
		ResourceBundle rbGerman = ResourceBundle.getBundle("Message", grLang);
		
		System.out.println("Pakistani people greet by saying: " + rbUrdu.getString("greeting"));
		System.out.println("Pakistani people farewell by saying: " + rbUrdu.getString("farewell"));
		System.out.println();
		System.out.println("US people greet by saying: " + rbUS.getString("greeting"));
		System.out.println("US people farewell by saying: " + rbUS.getString("farewell"));
		System.out.println();
		System.out.println("France people greet by saying: " + rbFrench.getString("greeting"));
		System.out.println("France people farewell by saying: " + rbFrench.getString("farewell"));
		System.out.println();
		System.out.println("German people greet by saying: " + rbGerman.getString("greeting"));
		System.out.println("German people farewell by saying: " + rbGerman.getString("farewell"));
	}
}
