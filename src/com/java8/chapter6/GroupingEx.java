package com.java8.chapter6;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.chapter6.Dish.Type;

public class GroupingEx {

	public static void main(String[] args) {
		final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

		/*
		 * Map<Dish.Type, List<Dish>> dishesByType =
		 * menu.stream().collect(Collectors.groupingBy(Dish::getType));
		 * System.out.println(dishesByType);
		 */
		/*
		 * Map<CaloricLevel, List<Dish>> checkingCaloric =
		 * menu.stream().collect(Collectors.groupingBy(d -> { if (d.getCalories() <=
		 * 400) return CaloricLevel.DIET; else if (d.getCalories() <= 700) return
		 * CaloricLevel.NORMAL; else return CaloricLevel.FAT; }));
		 * System.out.println(checkingCaloric);
		 * 
		 * 
		 * Map<Dish.Type, Map<CaloricLevel, List<Dish>>> checkTypeCal =
		 * menu.stream().collect(Collectors.groupingBy(Dish::getType,
		 * Collectors.groupingBy(d -> { if (d.getCalories() <= 400) return
		 * CaloricLevel.DIET; else if (d.getCalories() <= 700) return
		 * CaloricLevel.NORMAL; else return CaloricLevel.FAT; })));
		 * System.out.println(checkTypeCal);
		 */
//		Map<Dish.Type, Long> typeCount = menu.stream()
//				.collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
//		System.out.println(typeCount);

		/*
		 * Map<Type, Optional<Dish>> OptMax = menu.parallelStream().collect(
		 * Collectors.groupingBy(Dish::getType,
		 * Collectors.maxBy(Comparator.comparingInt(Dish::getCalories))));
		 * System.out.println(OptMax);
		 */
		/*
		 * Map<Dish.Type, Dish> mostCaloriesbyType =
		 * menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors
		 * .collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories
		 * )), Optional::get))); System.out.println(mostCaloriesbyType);
		 */
		/*
		 * Map<Dish.Type, Set<CaloricLevel>> caloricLevelsByType =
		 * menu.stream().collect( Collectors.groupingBy(Dish::getType,
		 * Collectors.mapping( dish -> { if (dish.getCalories() <= 400) return
		 * CaloricLevel.DIET; else if (dish.getCalories() <= 700) return
		 * CaloricLevel.NORMAL; else return CaloricLevel.FAT; }, Collectors.toSet() )));
		 */

		// Map<Dish.Type, Dish>
		// mostCalories=menu.stream().collect(Collectors.groupingBy(Dish::getType,
		// Collectors.collectingAndThen(Collectors.maxBy(comparator), finisher)))

		/*
		 * Map<Dish.Type, List<Dish>> groupEx =
		 * menu.stream().collect(Collectors.groupingBy(Dish::getType));
		 * System.out.println(groupEx);
		 */

		/*
		 * Map<CaloricLevel, List<Dish>> dishesByCaloriclevel =
		 * menu.stream().collect(Collectors.groupingBy(d -> { if (d.getCalories() <=
		 * 400) return CaloricLevel.DIET; else if (d.getCalories() <= 700) return
		 * CaloricLevel.NORMAL; else return CaloricLevel.FAT;
		 * 
		 * })); System.out.println(dishesByCaloriclevel);
		 */

		/*
		 * Map<Dish.Type, Long> typeCount = menu.stream()
		 * .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
		 * System.out.println(typeCount);
		 * 
		 * 
		 * Map<Dish.Type, Dish> highestCal =
		 * menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors
		 * .collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories
		 * )), Optional::get))); System.out.println(highestCal);
		 */

		/*
		 * Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesbyType =
		 * menu.stream() .collect(Collectors.partitioningBy(Dish::isVegetarian,
		 * Collectors.groupingBy(Dish::getType)));
		 * System.out.println(vegetarianDishesbyType);
		 */
		/*
		 * Map<Boolean, Object> mostcaloriesDish = menu.stream()
		 * .collect(Collectors.partitioningBy(Dish::isVegetarian,
		 * Collectors.collectingAndThen(
		 * Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)),
		 * Optional::get))); System.out.println(mostcaloriesDish);
		 */
		

	}

}
