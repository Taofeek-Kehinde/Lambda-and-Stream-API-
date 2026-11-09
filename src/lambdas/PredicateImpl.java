package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImpl {
    static void main(String[] args) {

        Predicate<String> customPredicate = (value) -> {
            System.out.println(value);

            return true;
        };

        List<String> names = new ArrayList<>();
        names.add("Adamu");
        names.add("Musa");
        names.add("John");

        names.forEach(name -> customPredicate.test(name));

    }
}
