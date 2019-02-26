package com.lacunasoftware.amplia;


import com.fasterxml.jackson.databind.ObjectMapper;


class Util {

	static byte[] decodeBase64(String s) {
		return new ObjectMapper().convertValue(s, byte[].class);
	}

	static String encodeBase64(byte[] content) {
		return new ObjectMapper().convertValue(content, String.class);
	}
}
