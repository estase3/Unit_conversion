package calculator;
import java.math.*;
import java.text.*;
import java.util.*;

public class UnitConversion {
	private float x;
	private double d,result;
	private String distance,time,db,vv;

	static final Map<String , Float> distanceMap = new HashMap<>() {{
	    put("Millimeter", Float.valueOf((float)1/1000));
	    put("Centimeter",Float.valueOf((float)1/100));
	    put("Decimetre",Float.valueOf((float)1/10));
	    put("Meter",Float.valueOf((float)1));
	    put("Kilometer",Float.valueOf((float)1000));
	}};
	static final Map<String , Double> timeMap = new HashMap<>() {{
	    put("Seconds", Math.pow(60, 0));
	    put("Minutes",Math.pow(60, 1));
	    put("Hours",Math.pow(60, 2));
	}};
	public String calculateDistance(float fromMap, float toMap, float number) {
		x=(float) (number*fromMap*Math.pow(toMap, -1));
		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.HALF_EVEN);
		distance=df.format((double)x);
		return distance;
	}
	public String calculateTime(double fromMap, double toMap, double number) {
		d=fromMap*Math.pow(toMap, -1)*number;
		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.HALF_EVEN);
		time=df.format(d);
		return time;
	}
	public String dbToVv(double db) {
		result=Math.pow(10,(double)db/20);
		DecimalFormat df = new DecimalFormat("#.#####");
		df.setRoundingMode(RoundingMode.HALF_EVEN);
		vv=df.format(result);
		return vv;
	}
	public String VvToDb(double vv) {
		result=20*Math.log10(vv);
		DecimalFormat df = new DecimalFormat("#.#####");
		df.setRoundingMode(RoundingMode.HALF_EVEN);
		db=df.format(result);
		return db;
	}
	
	public static void main(String[] args) {


}
}
