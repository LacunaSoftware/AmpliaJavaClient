package com.lacunasoftware.amplia;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class Util {

	static byte[] decodeBase64(String s) {
		return new ObjectMapper().convertValue(s, byte[].class);
	}

	static String encodeBase64(byte[] content) {
		return new ObjectMapper().convertValue(content, String.class);
	}

	static Date parseApiDate(String dateStr) {
		Date date;
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
		try {
			date = fmt.parse(dateStr);
		} catch (ParseException ex) {
			date = null;
		}

		return date;
	}

	static Date parseApiDateWithMillis(String dateStr) {
		Date date;
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSX");
		try {
			date = fmt.parse(dateStr);
		} catch (ParseException ex) {
			date = null;
		}
		return date;
	}

	static String formatToApiDate(Date date) {
		SimpleDateFormat fmt = new SimpleDateFormat("MM-dd-yyyy");
		return fmt.format(date);
	}
}
