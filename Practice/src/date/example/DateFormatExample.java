package date.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {

	
	
	private static Date ConvertToDate(String exp,String format) {
		DateFormat sourceFormat = new SimpleDateFormat(format);
		sourceFormat.setLenient(false);

		Date dt = null;

		if (exp != "") {
			try {
				dt = sourceFormat.parse(exp);
			} catch (Exception ex) {
				dt = null;
			}
		}

		return dt;
	}
	
	private static String ConvertToDate1(String start_dt,String curformat, String newformat){
		//String start_dt = "2011-01-01";
		DateFormat formatter = new SimpleDateFormat(curformat); 
		Date date = null;
		try {
			date = (Date)formatter.parse(start_dt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat newFormat = new SimpleDateFormat(newformat);
		String finalString = newFormat.format(date);
		return finalString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // String date=new Date().toString();
       String date1="2016-08-12";
       String date2="2016-08-12";
//       String date3="08-12-2016";
       System.out.println(ConvertToDate1(date2,"yyyy-dd-mm","dd/mm/yyyy").toString());
       System.out.println(ConvertToDate1(date1,"yyyy-mm-dd","dd-mm-yyyy").toString());
	}

}
