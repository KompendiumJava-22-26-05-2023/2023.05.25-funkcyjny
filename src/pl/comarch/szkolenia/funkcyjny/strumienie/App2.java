package pl.comarch.szkolenia.funkcyjny.strumienie;

import pl.comarch.szkolenia.funkcyjny.anonimowe.Car;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "3"));
        list.add(new Car("BMW", "5"));
        list.add(new Car("Audi", "A3"));
        list.add(new Car("BMW", "3"));
        list.add(new Car("Toyota", "Corolla"));
        list.add(new Car("Kia", "Ceed"));
        list.add(new Car("BMW", "3"));
        list.add(new Car("Toyota", "Corolla"));
        list.add(new Car("Fiat", "126p"));

        list.stream()
                .peek(car -> car.setBrand("Jakis"))
                        .forEach(car -> System.out.println(car));

        System.out.println(list);
    }
}
