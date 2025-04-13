package Localization;

import java.text.NumberFormat;
import java.util.Locale;

public class Numbers {

    public static void main(String[] args)
    {
        double n = 12345.67;
        
        NumberFormat dfUS = NumberFormat.getNumberInstance(new Locale("en", "US"));
        System.out.println("USA Number Format: " + dfUS.format(n));
        
        NumberFormat dfFr = NumberFormat.getNumberInstance(new Locale("fr", "FR"));
        System.out.println("France Number Format: " + dfFr.format(n));
        
        NumberFormat dfInd = NumberFormat.getNumberInstance(new Locale("in", "IND"));
        System.out.println("India Number Format: " + dfInd.format(n));
        
        NumberFormat dfPak = NumberFormat.getNumberInstance(new Locale("ur", "PK"));
        System.out.println("Pakistan Number Format: " + dfPak.format(n));

    }
}
