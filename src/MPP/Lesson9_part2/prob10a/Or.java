package MPP.Lesson9_part2.prob10a;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
//		System.out.println(someSimpleIsTrue(list));

		Stream<String> stringStream = Stream.of("Bill", "Thomas", "Marry");
//		System.out.println(stringStream.collect(Collectors.joining(", ")));

		IntStream myIntStream = IntStream.of(5, 3, 8, 1, 9, 2);
		IntSummaryStatistics summaryStatistics = myIntStream.summaryStatistics();
		System.out.println(summaryStatistics.getMax());
		System.out.println(summaryStatistics.getMin());
	}
	
	public static boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream()
				.map(e -> e.flag)
				.reduce(false, (a, b) -> a || b);
	}

}
