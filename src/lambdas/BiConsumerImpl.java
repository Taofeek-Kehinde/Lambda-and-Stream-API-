package lambdas;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerImpl {

    public static void main(String[] args) {
        BiConsumer<String, Integer> customBiConsumer = (name, age) -> System.out.println("My name is " + age + " i am " + age + " years old");

        Map<String, Integer> map = Map.of(
                "Adamu", 21,
                "Bola", 9000,
                "Dike", 99
        );

        map.forEach(customBiConsumer);
    }

}