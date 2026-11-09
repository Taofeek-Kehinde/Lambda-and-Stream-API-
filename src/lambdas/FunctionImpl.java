package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionImpl {

    static void main(String[] args) {

        Function<String, String> customFunction = (value) -> {
            System.out.println(value);

            return value;
        };

        List<String> names = new ArrayList<>();
        names.add("Adamu");
        names.add("Musa");
        names.add("John");


        names.forEach(name -> customFunction.apply(name));
    }
}
