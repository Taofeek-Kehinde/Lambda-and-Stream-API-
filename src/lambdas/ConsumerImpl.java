package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {

    static void main(String[] args) {

        Consumer<Integer> interConsumer = (number) -> {
            System.out.println(number);
        };

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        numbers.forEach(interConsumer);
    }
}
