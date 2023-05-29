package pl.comarch.szkolenia.funkcyjny.wartosc.opcjonalna;

import pl.comarch.szkolenia.funkcyjny.anonimowe.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Zadanie2 {
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

        /*Car car1 = new Car("BMW", "3");
        Car car2 = new Car("BMW", "5");
        System.out.println(car1.equals(car2));*/

        Optional<String> stringBox = list.stream()
                .distinct()
                .map(car -> car.getBrand())
                .skip(2)
                .findFirst();
        System.out.println(stringBox.get());
    }
}
