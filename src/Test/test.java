package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat aft = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y2 = aft.parse("30/04/2020 18:36:15");

		Calendar cal = Calendar.getInstance();
		cal.setTime(y2);
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		y2 = cal.getTime();
		System.out.println(aft.format(y2));
	}

}
