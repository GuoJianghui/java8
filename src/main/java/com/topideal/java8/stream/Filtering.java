/**
 * 
 */
package com.topideal.java8.stream;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

/**
 * @author ripdent
 *
 */
public class Filtering {


	public static void main(String[] args) {
		List<Dish> vegetarianMenu = Dish.menu.stream().filter(Dish::isVegetarian).collect(toList());
		vegetarianMenu.forEach(System.out::println);
		
		// 去重
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);
        
        // 限制数量
        List<Dish> dishesLimit3 = Dish.menu.stream().filter(d -> d.getCalories() > 300).limit(3).collect(toList());
        dishesLimit3.forEach(System.out::println);
        
        // 跳过
        List<Dish> dishesSkip2 = Dish.menu.stream().filter(d -> d.getCalories() > 300).skip(2).collect(toList());
        dishesSkip2.forEach(System.out::println);
	}
}
