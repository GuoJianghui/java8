/**
 * 
 */
package com.topideal.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ripdent
 *
 */
public class FilteringApples {

	static List<Apple> inventory =  Arrays.asList(
			new Apple("red", 100),
			new Apple("red", 120),
			new Apple("green", 100),
			new Apple("green", 150),
			new Apple("black", 30));
	
	public static void main(String[] args) {
		System.out.println(filterBlackApple(inventory));
		System.out.println(filterHeavyApple(inventory));
		System.out.println(filterApple(inventory, new AppleColorPredicate()));
		System.out.println(filterApple(inventory, (Apple a) -> a.getColor().equals("black")));
	}
	
	static List<Apple> filterBlackApple(List<Apple> inventory) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : inventory) {
			if ("black".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	
	static List<Apple> filterHeavyApple(List<Apple> inventory) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : inventory) {
			if (apple.getWeight() - 120 >= 0) {
				result.add(apple);
			}
		}
		return result;
	}
	
	static List<Apple> filterApple(List<Apple> inventory, ApplePredicate predicate) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	interface ApplePredicate {
		public boolean test(Apple a);
	}
	
	static class AppleColorPredicate implements ApplePredicate {
		public boolean test(Apple apple){
			return "green".equals(apple.getColor());
		}
	}
}