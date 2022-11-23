import Driver.*;
import Transport.*;
import java.util.List;


public class Main {

    private static void diagnostic(Transport... transports) {
        for (Transport transport : transports) {
            diagnosticTransport(transport);
        }
    }

    public static void diagnosticTransport(Transport transport) {
        try {
            if (!transport.diagnostic()) {
                throw new RuntimeException("Авто " + transport.getModel() + " " + transport.getBrand() + " - требуется диагностика");
            }
        } catch(RuntimeException e){
            System.out.println(e.getMessage());

        }
    }
    public static void printCar(Car car)
    {
        System.out.println("Информация об автомобиле:" +
                " марка - " + car.getBrand() +
                ", модель - " + car.getModel() +
                ", мощность двигателя - " + car.getEngineVolume() +
                ", тип кузова - " + car.getBodyType());
    }

    public static void printBus(Bus bus) {
        System.out.println("Информация об автобусе:" +
                " марка - " + bus.getBrand() +
                ", модель - " + bus.getModel() +
                ", мощность двигателя - " + bus.getEngineVolume() +
                ", тип вместимости - " + bus.getBusCapacity());
    }

    public static void printTruck(Truck truck) {
        System.out.println("Информация о грузовике:" +
                " марка - " + truck.getBrand() +
                ", модель - " + truck.getModel() +
                ", мощность двигателя - " + truck.getEngineVolume() +
                ", тип грузоподъёмности - " + truck.getTruckWeight());
    }


    public static void main (String[]args) {

        Car kia = new Car("Kia", "Ria", 1.6, BodyType.HATCHBACK);
        Car honda = new Car("Honda", "CR-V", 2.0, BodyType.CROSSOVER);
        Car hyundai = new Car("Hyundai", "Creta", 1.8, BodyType.SEDAN);
        Car toyota = new Car("Toyota", "Camry", 3.0, BodyType.UNIVERSAL);

        Truck pazik = new Truck("Паз", "Вектор", 3.7, TruckWeight.N_3);
        Truck kavz = new Truck("КАВЗ", "4239", 2.5, TruckWeight.N_1);
        Truck gaz = new Truck("ГАЗ", "3300 Садко", 2.5, TruckWeight.N_2);
        Truck gazon = new Truck("ГАЗон", "Next", 3.6, TruckWeight.N_1);

        Bus volgabus = new Bus("Volgabus", "Дельта 12", 1.7, BusCapacity.N3);
        Bus zonda = new Bus("Zonda", "YCK6116HGL3", 2.5, BusCapacity.N1);
        Bus daewoo = new Bus("Daewoo", "BC212MA", 3, BusCapacity.N1);
        Bus gazelle = new Bus("Газель", "Next A63R42", 1.5, BusCapacity.N2);

        diagnostic(hyundai, honda, hyundai, toyota,
                pazik, kavz, gaz, gazon,
                volgabus, zonda, daewoo, gazelle);

        System.out.println();
        System.out.println(honda);
        System.out.println(pazik);
        System.out.println(volgabus);

        System.out.println();
        daewoo.getMaxSpeed();
        gazon.getBestLapTime();
        hyundai.pitStop();
        System.out.println();

        System.out.println();

        DriverB mealadze = new DriverB("Валерий Меладзе Меладзович", true, 5);
        mealadze.start(hyundai);

        DriverC leontiev = new DriverC("Леонтьев Валерий Яковлевич", true, 7);
        leontiev.start(pazik);

        DriverD pugacheva = new DriverD("Алла Борисовна Пугачёва", true, 10);
        pugacheva.start(volgabus);


        System.out.println();
        mealadze.start(hyundai);
        mealadze.stop(hyundai);
        mealadze.refill(hyundai);


        System.out.println();
        leontiev.start(kavz);
        leontiev.stop(kavz);
        leontiev.refill(kavz);

        System.out.println();
        pugacheva.start(zonda);
        pugacheva.stop(zonda);
        pugacheva.refill(zonda);

        List<Transport> transports = List.of(hyundai,kia,volgabus,zonda,toyota,kavz,gazon,pazik,gazelle);

        Sponsor Reebok =  new Sponsor("Reebok",100500);
        honda.addSponsor(Reebok);
        DriverB bascov = new DriverB("Николай Басков Басковтьян", true,1);
        honda.addDriver(bascov);

        Mechanic<Car> kanevski = new Mechanic<>("Леонид", " Каневский", "Следствие вели");
        honda.addMechanic(kanevski);

        for(Transport transport : transports){
            printInfo(transport);
        }
    }

    public static void printInfo(Transport transport){
        System.out.println("Автомобиль - " + transport.getModel() + transport.getBrand());
        System.out.println("Водитель - ");
        for(Driver<?> driver : transport.getDrivers()){
            System.out.println(driver.getFullNameDriver());
        }
        System.out.println("Спонсор - ");
        for (Sponsor sponsor : transport.getSponsors()){
            System.out.println(sponsor.getCompanyName());
        }
        System.out.println("Механик - ");
        for (Mechanic<?> mechanic: transport.getMechanics()){
            System.out.println(mechanic.getSurname() + mechanic.getName());
        }

    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.diagnostics()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + transport.getModel() + " - проходит диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
