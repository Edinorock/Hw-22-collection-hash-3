package Transport;

public class Truck extends Transport implements Compating {

    private TruckWeight truckWeight;

    public Truck(String brand, String model, double engineVolume, TruckWeight truckWeight) {
        super(brand, model, engineVolume);
        this.truckWeight = truckWeight;
    }

    public TruckWeight getTruckWeight() {

        return truckWeight;
    }

    public void setTruckWeight(TruckWeight TruckWeight) {

        this.truckWeight = TruckWeight;
    }

    @Override
    public void repair() {

    }

    @Override
    public void fixTransport() {

    }

    @Override
    public boolean diagnostics() {

        return Math.random() > 0.65;
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

        return Math.random()>0.65;
    }

    @Override
    public void printType() {
        if(truckWeight ==null) {
            System.out.println("Нет информации");
        } else {
            String from = truckWeight.getFrom() == null ? " " : "от " + truckWeight.getFrom() + " ";
            String to = truckWeight.getTo() == null ? " " : "от " + truckWeight.getTo();
            System.out.println("Грузоподъемность: " + from + to);
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
        return "Truck{" +
                "TruckWeight=" + truckWeight +
                '}';
    }
}