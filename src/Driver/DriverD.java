package Driver;
import Transport.*;

public class DriverD extends Driver <Bus>{

    public DriverD(String fullNameDriver, boolean license, int experience) {
        super(fullNameDriver, license, experience);
    }

    @Override
    public void start(Bus transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.startMoving();
    }

    @Override
    public void stop(Bus transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.finishMoving();
    }

    @Override
    public void refill(Bus transport) {
        System.out.print(this.getFullNameDriver() + " на ");
        transport.pitStop();
    }

    public void getCar(Bus buses) {
        System.out.println("Водитель " + getFullNameDriver() + " управляет " + buses.getBrand() + " "
                + buses.getModel() + " и будет участвовать в заезде");
    }
}
