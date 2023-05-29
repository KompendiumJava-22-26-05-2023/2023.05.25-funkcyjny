package pl.comarch.szkolenia.funkcyjny.funkcyjny;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> "Liczba: " + i;

        System.out.println(function.apply(15));
        System.out.println(function.apply(7));
        System.out.println(function.apply(35));

        Predicate<String> predicate = s -> s.length() > 10;

        System.out.println(predicate.test("asdf"));
        System.out.println(predicate.test("Mateusz"));
        System.out.println(predicate.test("akjshdgflkajhsgkl"));

        Consumer<String> consumer = s -> System.out.println(s);

        consumer.accept("Janusz");
        consumer.accept("Zbyszek");
        consumer.accept("Wiesiek");

        Supplier<String> supplier = () -> "default string";

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> {
            if(x.equals(y)) {
                return 1;
            } else if(x > y) {
                return x;
            } else {
                return y;
            }
        };

        System.out.println(biFunction.apply(4,4));
        System.out.println(biFunction.apply(4,6));
        System.out.println(biFunction.apply(4,2));
    }
}
