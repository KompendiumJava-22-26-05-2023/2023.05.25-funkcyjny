package pl.comarch.szkolenia.funkcyjny.anonimowe;

import java.util.*;

public class App {
    public static void main(String[] args) {
        SimpleInterface obiekt = new SimpleInterface() {
            @Override
            public void method1() {
                System.out.println("metoda 1");
            }

            @Override
            public void method2() {
                System.out.println("metoda 2");
            }

            @Override
            public void method3() {
                System.out.println("metoda 3");
            }
        };
        obiekt.method1();
        obiekt.method2();
        obiekt.method3();

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla"));
        cars.add(new Car("Audi", "A5"));
        cars.add(new Car("BMW", "3"));
        cars.add(new Car("Kia", "Ceed"));

        System.out.println(cars);

        Collections.sort(cars, (c1, c2) -> c1.getBrand().compareTo(c2.getBrand()));

        System.out.println(cars);

        Collections.sort(cars, (c1, c2) -> c1.getModel().compareTo(c2.getModel()));

        System.out.println(cars);
    }
}
