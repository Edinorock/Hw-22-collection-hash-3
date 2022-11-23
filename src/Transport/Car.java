package Transport;
import Driver.*;
import java.util.Objects;

public class Car extends Transport implements Compating {

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {

        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {

        this.bodyType = bodyType;
    }

    @Override
    public void repair() {
    }

    @Override
    public void fixTransport() {
    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.5;
    }

    @Override
    public void startMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " - начинает гонку");

    }

    @Override
    public void finishMoving() {
        System.out.println(this.getBrand() + " " + this.getModel() + " - заканчивает гонку");
    }

    @Override
    public boolean diagnostic() {
        return Math.random() > 0.5;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Нет информации");
        } else {
            System.out.println("Тип кузова автомобиля: " + bodyType);
        }
    }

    @Override
    public void pitStop() {
        System.out.println(this.getBrand() + " " + this.getModel() + " - уходит на пит-стоп");
    }

    @Override
    public double getBestLapTime() {
        System.out.println(this.getBrand() + " " + this.getModel() + " - лучшее время круга");
        return 0;
    }

    @Override
    public double getMaxSpeed() {
        System.out.println(this.getBrand() + " " + this.getModel() + " - достигает максимальной скорости");
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "BodyType=" + bodyType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Car)) {
            return false;
        }

        Car car = (Car) o; {
            return Double.compare(car.getEngineVolume(), getEngineVolume()) == 0 &&
                    getBrand().equals(car.getBrand()) &&
                    getModel().equals(car.getModel()) &&
                    getDrivers().equals(car.getDrivers()) &&
                    getSponsors().equals(car.getSponsors()) &&
                    getMechanics().equals(car.getMechanics());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getBrand(), getEngineVolume(), getDrivers(), getMechanics(), getSponsors());
    }
}