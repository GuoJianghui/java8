/**
 * 
 */
package com.topideal.java8.stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ripdent
 *
 */
public class StreamBasic {
	
	public static void main(String[] args) {
		getLowCaloricDishesNamesInJava7(Dish.menu).forEach(System.out::println);
		System.out.println("---------");
		getLowCaloricDishesNamesInJava8(Dish.menu).forEach(System.out::println);
	}

	static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes) {
		List<Dish> lowCaloricDishes = new ArrayList<>();
		for (Dish dish : dishes) {
			if (dish.getCalories() < 400) {
				lowCaloricDishes.add(dish);
			}
		}
		List<String> lowCaloricDishesName = new ArrayList<>();
		Collections.sort(lowCaloricDishes, new Comparator<Dish>() {

			@Override
			public int compare(Dish o1, Dish o2) {
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
		});
		for (Dish dish : lowCaloricDishes) {
			lowCaloricDishesName.add(dish.getName());
		}
		return lowCaloricDishesName;
	}
	
	public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
		return dishes.stream().filter(d ->  d.getCalories() < 400)
				.sorted(comparing(Dish::getCalories))
				.map(Dish::getName)
				.collect(toList());
	}
}
