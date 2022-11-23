package Driver;
import Transport.*;

public class DriverB extends Driver <Car> {

    public DriverB(String fullNameDriver, boolean license, int experience) {
        super(fullNameDriver, license, experience);
    }

    @Override
    public void start(Car transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.startMoving();

    }

    @Override
    public void refill(Car transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.pitStop();
    }

    @Override
    public void stop(Car transport){
        System.out.print(this.getFullNameDriver() + " на ");
        transport.finishMoving();
    }

    public void getCar(Car cars) {
        System.out.println("Водитель " + getFullNameDriver() + " управляет " + cars.getBrand() + " "
                + cars.getModel() + " и будет участвовать в заезде");
    }
}