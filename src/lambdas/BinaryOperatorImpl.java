package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {

    static void main(String[] args) {
        BinaryOperator<String> customOperator = (value1, value2) -> {
            System.out.println("Add: " + value1 + " and " + value2);

            return value1 + " and " + value2;
        };

        List<String> names = new ArrayList<>();
        names.add("Adamu");
        names.add("Musa");
        names.add("John");

        names.forEach(name -> {
            String result = customOperator.apply(name, "User");
            System.out.println(result);
        });
    }
}
