package pl.comarch.szkolenia.funkcyjny.wartosc.opcjonalna;

import pl.comarch.szkolenia.funkcyjny.anonimowe.Car;

import java.util.Optional;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        Optional<Car> carBox = findCar("kjhsdgjkhsd");
        if(carBox.isPresent()) {
            Car car = carBox.get();
            System.out.println(car.getBrand());
        } else {
            System.out.println("nie ma takiego auta !!!");
        }

        Car car = carBox.orElse(new Car("default", "default"));
        System.out.println(car.getBrand());

        Supplier<Car> defaultCarSupplier =
                () -> new Car("default", "default");

        Car car2 = carBox.orElseGet(defaultCarSupplier);
        carBox.ifPresent(c1 -> System.out.println(c1.getBrand()));
        carBox.ifPresentOrElse(
                c1 -> System.out.println(c1.getBrand() + " " + c1.getModel()),
                () -> System.out.println("ten optional jest pusty")
                );
    }
    public static Optional<Car> findCar(String plate) {
        //petla
        if(false) {
            return Optional.of(new Car("BMW", "5"));
        } else {
            return Optional.empty();
        }
    }
}
