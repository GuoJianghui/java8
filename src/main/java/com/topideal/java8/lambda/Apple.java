/**
 * 
 */
package com.topideal.java8.lambda;

import java.io.Serializable;

/**
 * @author ripdent
 *
 */
public class Apple implements Serializable {

	private static final long serialVersionUID = 1L;

	private String color;
	
	private float weight;

	public Apple(String color, float weight) {
		this.color = color;
		this.weight = weight;
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "apple[weight: " + this.getWeight() + ", color: " + this.getColor() + "]";
	}
}
