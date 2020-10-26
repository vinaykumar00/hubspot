package com.blacaz.hubspot.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSXXX");
		String string1 = "2020-08-13T21:52:00.000Z";
		
		string1.split("T");
	
		System.out.println(string1.split("T")[0]+"T00:00:00.000Z");
		
		Date result1 = df1.parse(string1.split("T")[0]+"T00:00:00.000Z");

		long timeStamp = result1.getTime();
	
		System.out.println(timeStamp);

		
	

	}
}
