package MPP.Lesson9_part2.prob11b;

@FunctionalInterface
public interface TriFunction<S,T,U,R> {
	R apply(S s, T t, U u);
}
