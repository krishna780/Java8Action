package JavaLambadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(15);
		arrayList.add(95);
		arrayList.add(55);
		arrayList.add(85);
		arrayList.add(35);
		arrayList.add(65);
		System.out.println(arrayList);
		arrayList.sort(Comparator.reverseOrder());
		System.out.println(arrayList);

	}

}
