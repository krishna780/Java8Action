package Chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.chapter6.Dish;

public class DishesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

		/*
		 * menu.stream().filter(d -> d.getType() ==
		 * Dish.Type.MEAT).collect(Collectors.toList()) .forEach(System.out::println);
		 * 
		 * // menu.stream().map(Dish::getName).map(String::length).forEach(System.out::
		 * println);
		 * 
		 * List<String> words = Arrays.asList("hello", "welcome"); List<String>
		 * uniqueChar = words.stream().map(w ->
		 * w.split("")).flatMap(Arrays::stream).distinct()
		 * .collect(Collectors.toList()); System.out.println(uniqueChar);
		 */

		List<Integer> someNumbers = Arrays.asList();

		int sum = someNumbers.stream().collect(Collectors.reducing(0, (a, b) -> a + b));
		System.out.println(sum);

	}

}
