package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {

    static void main(String[] args) {
        UnaryOperator<String> customOperator = (value) -> {
            System.out.println("Converting: " + value);

            return value.toUpperCase();
        };

        List<String> names = new ArrayList<>();
        names.add("Adamu");
        names.add("Musa");
        names.add("John");

        names.forEach(name -> {
            String result = customOperator.apply(name);
            System.out.println(result);
        });
    }
}
