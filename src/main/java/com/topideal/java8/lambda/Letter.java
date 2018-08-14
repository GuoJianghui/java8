/**
 * 
 */
package com.topideal.java8.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author ripdent
 *
 */
public class Letter {
	
	static String addHeader(String text) {
		return "from topideal:\n " +  text;
	}
	
	static String addFooter(String text) {
		return text + "\n Kind regards";
	}
	
	static String addContent(String text) {
		return text;
	}
	
	public static void main(String[] args) {
		Function<String, String> letter = Letter::addHeader;
		letter = letter.andThen(Letter::addContent).andThen(Letter::addFooter);
		System.out.println(letter.apply("Java 8 is amazing"));

	}

}
