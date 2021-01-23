package com.java8.chapter6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingExa {

	public static void main(String[] args) {
		final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		/*
		 * IntSummaryStatistics sum =
		 * menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
		 * System.out.println(sum);
		 * 
		 * double sum = menu.stream().mapToDouble(Dish::getCalories).sum();
		 * System.out.println(sum);
		 * 
		 * Integer sum =
		 * menu.stream().map(Dish::getCalories).collect(Collectors.reducing(Integer::sum
		 * )).get(); System.out.println(sum);
		 */
		
		  menu.stream().map(Dish::getName).forEach(System.out::println);
		  /*
			 * Map<Dish.Type, Dish>
			 * mapdish=menu.stream().collect(Collectors.groupingBy(Dish::getType,
			 * Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::
			 * getCalories)), Optional::get))); System.out.println(mapdish);
			 */
	  menu.stream().filter(d->d.getCalories()>450)
	  .map(Dish::getName).forEach(System.out::println);

}}
