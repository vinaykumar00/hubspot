package com.blacaz.hubspot.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class HubSpotUtility {

	/**
	 * API to generate tracking id
	 * 
	 * @return
	 */
	public String getTrackingID() {
		UUID uuid = UUID.randomUUID();

		return uuid.toString();
	}

	/**
	 * Method to convert DateTime to timestamp
	 * 
	 * @param time
	 * @return
	 * @throws ParseException
	 */
	public String getTimestamp(String time) throws ParseException {
		if (null != time) {
			SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSXXX");
			Date result1 = df1.parse(time.split("T")[0] + "T00:00:00.000Z");

			long timeStamp = result1.getTime();
			return String.valueOf(timeStamp);
		}
		return null;

	}
}
