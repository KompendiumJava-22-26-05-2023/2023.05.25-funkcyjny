package pl.comarch.szkolenia.funkcyjny.anonimowe;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(!(obj instanceof Car)) {
            return false;
        }
        Car car = (Car) obj;
        return this.getBrand().equals(car.brand) && this.getModel().equals(car.model);
    }

    @Override
    public int hashCode() {
        return (this.brand+this.model).hashCode();
    }
}
