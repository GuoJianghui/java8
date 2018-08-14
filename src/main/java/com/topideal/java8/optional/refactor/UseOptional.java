/**
 * 
 */
package com.topideal.java8.optional.refactor;

import com.topideal.java8.optional.Person;

/**
 * @author ripdent
 *
 */
public class UseOptional {

	public static void main(String[] args) {
		Person person = new Person();
		person.getCar().getInsurance();
	}
	
	public static String getCarInsuranceName(Person person) {
		return person.getCar().getInsurance().getName();
	}
}
