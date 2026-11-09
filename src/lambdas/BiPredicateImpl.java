package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateImpl {
    static void main(String[] args) {

        BiPredicate<String, Integer> customBiPredicate = (name, length) -> {
            System.out.println("Checking " + name + " with length " + length);

            return name.length() == length;
        };

        List<String> names = new ArrayList<>();
        names.add("Adamu");
        names.add("Musa");
        names.add("John");

        names.forEach(name -> {
            boolean result = customBiPredicate.test(name, 4);
            System.out.println(result);
        });
    }
}
