package Chapter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TraderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		/*
		 * transactions.stream().filter(a -> a.getYear() ==
		 * 2011).sorted(Comparator.comparing(Transaction::getValue))
		 * .map(Transaction::getTrader).forEach(System.out::println);
		 */
		transactions.stream().map(m -> m.getTrader().getCity()).distinct().forEach(System.out::println);
           	
	
	}

}
