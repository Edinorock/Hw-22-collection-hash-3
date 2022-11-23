package Driver;
import Transport.*;

public class DriverC extends Driver <Truck>{

    public DriverC(String fullNameDriver, boolean license, int experience) {
        super(fullNameDriver, license, experience);
    }

    @Override
    public void start(Truck transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.startMoving();
    }

    @Override
    public void stop(Truck transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.finishMoving();
    }

    @Override
    public void refill(Truck transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.pitStop();
    }

    public void getCar(Truck trucks) {
        System.out.println("Водитель " + getFullNameDriver() + " управляет " + trucks.getBrand() + " "
                + trucks.getModel() + " и будет участвовать в заезде");
    }
}