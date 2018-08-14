/**
 * 
 */
package com.topideal.java8.optional.refactor;

import java.util.Optional;

/**
 * @author ripdent
 *
 */
public class Car {

	private Optional<Insurance> insurance;
	
	/**
	 * @return the insurance
	 */
	public Optional<Insurance> getInsurance() {
		return insurance;
	}

	/**
	 * @param insurance the insurance to set
	 */
	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}
}
