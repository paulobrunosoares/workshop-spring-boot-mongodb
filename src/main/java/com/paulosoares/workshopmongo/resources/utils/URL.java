package com.paulosoares.workshopmongo.resources.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

	public static String decodeParm(String tex) {
		try {
			return URLDecoder.decode(tex, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
}
