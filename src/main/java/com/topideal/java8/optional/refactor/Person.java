/**
 * 
 */
package com.topideal.java8.optional.refactor;

import java.util.Optional;

/**
 * @author ripdent
 *
 */
public class Person {

	private Optional<Car> car;

	/**
	 * @return the car
	 */
	public Optional<Car> getCar() {
		return car;
	}

	/**
	 * @param car the car to set
	 */
	public void setCar(Optional<Car> car) {
		this.car = car;
	}
}
