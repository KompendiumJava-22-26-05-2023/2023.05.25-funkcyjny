package pl.comarch.szkolenia.funkcyjny.strumienie;

import pl.comarch.szkolenia.funkcyjny.anonimowe.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 5, 6, 5, 7, 8, 8, 10, 9, 10);
        System.out.println(list);

        list.stream()
                .filter(i -> i > 5)
                .peek(i -> System.out.println(i))
                .skip(2)
                .distinct()
                .map(i -> "Liczba: " + i)
                .limit(2)
                .forEach(x -> System.out.println(x));

    }
}
