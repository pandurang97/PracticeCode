package SelecniumCode;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d.toString());   // Default General format
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sd = new SimpleDateFormat("MM/DD/YYYY hh:mm:ss");
		System.out.println(sd.format(d));
	}

}
