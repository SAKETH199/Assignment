package com.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateFormat {
	public static String convertDateFormat(String date) throws ParseException
	{
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
			Date d1=sdf.parse(date);
			return d1.toString();
	}

}
