package Transport;
import java.util.Objects;
import java.util.Set;


public class Mechanic <T extends Transport> {
    private final String name;
    private final String surname;
    private String company;
    public Set <T> fixCars;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public Set<T> getFixCars() {
        return fixCars;
    }

    public void setFixCars(Set<T> fixCars) {

        this.fixCars = fixCars;
    }

    public void fixCars(T car) {
        System.out.println("Механик " + this.name + " починил - " + car.getBrand() + " " + car.getModel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Mechanic<?> mechanic = (Mechanic<?>) o; {
            return Objects.equals(name, mechanic.name) &&
                    Objects.equals(surname, mechanic.surname) &&
                    Objects.equals(company, mechanic.company);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company);
    }
}