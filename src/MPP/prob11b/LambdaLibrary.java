package MPP.prob11b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary implements TriFunction<List<Employee>, Integer, Character, String>{

    @Override
    public String apply(List<Employee> employees, Integer integer, Character character) {
        return employees.stream()
                .filter(e -> e.getSalary() > integer && e.getLastName().charAt(0) > character)
                .map(e -> e.getFirstName() + " " + e.getLastName())
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
