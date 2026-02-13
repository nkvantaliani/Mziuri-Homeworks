import java.io.Serializable;

public class Country implements Serializable {
    private String countryName;
    private double countryPopulation;
    private double countryArea;

    public Country(String countryName, double countryPopulation, double countryArea) {
        this.countryName = countryName;
        this.countryPopulation = countryPopulation;
        this.countryArea = countryArea;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(double countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public double getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(double countryArea) {
        this.countryArea = countryArea;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", countryPopulation=" + countryPopulation +
                ", countryArea=" + countryArea +
                '}';
    }
}
