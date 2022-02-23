package calculator;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ResistanceCalculator {
	private String resS,sum;
	private double mult,res;
	private DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
	static final Map<String , String> valuesMap = new HashMap<>() {{
	    put("Black", "0");
	    put("Brown", "1");
	    put("Red", "2");
	    put("Orange", "3");
	    put("Yellow", "4");
	    put("Green", "5");
	    put("Blue", "6");
	    put("Violet", "7");
	    put("Grey", "8");
	    put("White", "9");
	    put("None", "");
	}};
	static final Map<String , Double> multMap = new HashMap<>() {{
	    put("Black", Math.pow(10, 0));
	    put("Brown", Math.pow(10, 1));
	    put("Red", Math.pow(10, 2));
	    put("Orange", Math.pow(10, 3));
	    put("Yellow", Math.pow(10, 4));
	    put("Green", Math.pow(10, 5));
	    put("Blue", Math.pow(10, 6));
	    put("Violet", Math.pow(10, 7));
	    put("Grey", Math.pow(10, 8));
	    put("White", Math.pow(10, 9));
	    put("Gold", Math.pow(10, -1));
	    put("Silver", Math.pow(10, -2));
	}};
	static final Map<String , String> tolMap = new HashMap<>() {{
	    put("Brown", "+-1%");
	    put("Red", "+-2%");
	    put("Green", "+-0.5%");
	    put("Blue", "+-0.25%");
	    put("Violet", "+-0.1%");
	    put("Grey", "+-0.05%");
	    put("Gold", "+-5%");
	    put("Silver", "+-10%");
	}};
	public String calc(String col1, String col2, String col3, String mults, String tol) {
		df.setMaximumFractionDigits(340);
		
		col1=valuesMap.get(col1);
		col2=valuesMap.get(col2);
		col3=valuesMap.get(col3);
		mult=multMap.get(mults);
		tol=tolMap.get(tol);
		sum=col1+col2+col3;
		res=Double.parseDouble(sum)*mult;		
		if (res>=1000000000)
			{
			res=res/1000000000;

			resS=df.format(res)+"G Ohm"+tol;
			}
		else if (res>=1000000)
		{
		res=res/1000000;
		resS=df.format(res)+"M Ohm"+tol;
		}
		else if(res>=1000)
		{
		res=res/1000;
		resS=df.format(res)+"k Ohm "+tol;
		}
		else
		resS=df.format(res)+" Ohm"+tol;
		return "Resistance: "+resS;
	}

}
