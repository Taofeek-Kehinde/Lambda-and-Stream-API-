package lambdas;

import java.util.function.BiFunction;
import java.util.stream.Stream;

public class BiFunctionImpl {

    static void main(String[] args) {

        BiFunction<String, String, String>  bifunction = (firstName, lastName) -> {
            System.out.println("firstName: " + firstName + " lastName: " + lastName );
            return firstName + " " + lastName;
        };

        Stream.of("Adamu", "Musa", "John")
                .map(name -> bifunction.apply(name, "Adamu"))
                .forEach((names) -> System.out.println(names));
    }
}
