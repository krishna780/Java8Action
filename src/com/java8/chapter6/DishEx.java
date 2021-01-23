package com.java8.chapter6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DishEx {

	public static void main(String[] args) {
		final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

		/*
		 * Comparator<Dish> compare = Comparator.comparingInt(Dish::getCalories);
		 * Optional<Dish> maxValue = menu.stream().collect(Collectors.maxBy(compare));
		 * System.out.println(maxValue); Optional<Dish> minValue =
		 * menu.stream().collect(Collectors.minBy(compare));
		 * System.out.println(minValue); IntSummaryStatistics sumrieze =
		 * menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
		 * System.out.println(sumrieze);
		 */
		// String shortMenu =
		// menu.stream().map(Dish::getName).collect(Collectors.joining(","));
		// System.out.println(shortMenu);
		// Long sum = menu.parallelStream().collect(Collectors.counting());
		// System.out.println(sum);
		// long dishsum = menu.stream().count();
		// System.out.println(dishsum);
		/*
		 * Comparator<Dish> ComEx = Comparator.comparing(Dish::getCalories); Optional
		 * max = menu.stream().collect(Collectors.maxBy(ComEx));
		 * System.out.println(max); Optional min =
		 * menu.stream().collect(Collectors.minBy(ComEx)); System.out.println(max);
		 */
		/*
		 * int totalCalories = menu.stream().collect(Collectors.reducing(0,
		 * Dish::getCalories, (i, j) -> i + j)); System.out.println(totalCalories);
		 */
		/*
		 * Optional<Integer> Maxval = menu.stream().map(Dish::getCalories)
		 * .collect(Collectors.reducing((d1, d2) -> d1 > d2 ? d1 : d2));
		 * System.out.println(Maxval)
		 */;
		/*
		 * Optional sumRed = menu.stream().map(Dish::getCalories).reduce(Integer::sum);
		 * System.out.println(sumRed);
		 */

		/*
		 * double mapDouble=menu.stream().mapToDouble(Dish::getCalories).sum();
		 * System.out.println(mapDouble);
		 */
		/*
		 * DoubleSummaryStatistics mapDoublesta =
		 * menu.stream().mapToDouble(Dish::getCalories).summaryStatistics();
		 * System.out.println(mapDoublesta);
		 */
		menu.stream().filter(x -> x.getName().startsWith("s")).sorted(Comparator.comparing(Dish::getName)).forEach(System.out::println);
	
	
	}

}
