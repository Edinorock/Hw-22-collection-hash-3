package Transport;

import java.util.Objects;

public class Sponsor {
    String companyName;
    int support;

    public Sponsor(String companyName, int support) {
        this.companyName = companyName;
        this.support = support;
    }
    public void sponsor(){

        System.out.printf("Спонсор \"%s\" финансировал гонку %d%n", companyName, support);
    }

    public String getCompanyName() {

        return companyName;
    }

    public int getSupport() {

        return support;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Sponsor sponsor = (Sponsor) o; {
            return support == sponsor.support &&
                    Objects.equals(companyName, sponsor.companyName);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, support);
    }
}