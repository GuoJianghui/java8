/**
 * 
 */
package com.topideal.java8.optional;

/**
 * @author ripdent
 *
 */
public class NullProblem {

	public static void main(String[] args) {
//		getCarInsuranceName(new Person());
		System.out.println(getCarInsuranceNameVersion1(new Person()));
		
		System.out.println(getCarInsuranceNameVersion2(new Person()));
	}
	
	public static String getCarInsuranceName(Person person) {
		return person.getCar().getInsurance().getName();
	}
	
	// 改进
	public static String getCarInsuranceNameVersion1(Person person) {
		if (person != null) {
			Car car = person.getCar();
			if (car != null) {
				Insurance insurance = car.getInsurance();
				if (insurance != null) {
					return insurance.getName();
				}
			}
		}
		return "Unknown";
	}
	
	public static String getCarInsuranceNameVersion2(Person person) {
		if (person == null) {
			return "Unknown";
		}
		
		Car car = person.getCar();
		if (car == null) {
			return "Unknown";
		}
		
		Insurance insurance = car.getInsurance();
		if (insurance == null) {
			return "Unknown";
		}
		
		return insurance.getName();
	}
}
