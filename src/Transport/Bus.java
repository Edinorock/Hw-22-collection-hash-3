package Transport;

public class Bus extends Transport implements Compating {

    private BusCapacity busCapacity;

    public Bus(String brand, String model, double engineVolume, BusCapacity busCapacity) {
        super(brand, model, engineVolume);
        setBusCapacity(busCapacity);
    }

    public void setBusCapacity(BusCapacity busCapacity) {

        this.busCapacity = busCapacity;
    }

    public BusCapacity getBusCapacity() {

        return busCapacity;
    }

    @Override
    public void repair() {
    }

    @Override
    public void fixTransport() {
    }

    @Override
    public boolean diagnostics() {

        return false;
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
        System.out.println("Автобус " + getBrand() + " " + getModel() + " - в диагностике не требуется");
        return true;
    }

    @Override
    public void printType() {
        if (busCapacity == null) {
            System.out.println("Нет информации");
        } else {
            System.out.println("Вместимость автобуса: от " + busCapacity.getFrom()+" до " + busCapacity.getTo());
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
}