package kz.karpenko;

/**
 * Created by Олег on 18.01.2017.
 */
public class Bus {
    private String name;
    private int busNumber;
    private int routeNumber;
    private String mark;
    private int startYear;
    private int mileage;

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                ", busNumber=" + busNumber +
                ", routeNumber=" + routeNumber +
                ", mark='" + mark + '\'' +
                ", startYear=" + startYear +
                ", mileage=" + mileage +
                '}';
    }

    public Bus(){};

    public Bus(String driverName,
               int busNumber,
               int routeNumber,
               String mark,
               int startYear,
               int mileage) {

        this.name = name;
        this.busNumber = busNumber;
        this.routeNumber = routeNumber;
        this.mark = mark;
        this.startYear = startYear;
        this.mileage = mileage;
    }

    public Bus(int busNumber, int startYear, int mileage) {
        this.name = "No name";
        this.busNumber = busNumber;
        this.routeNumber = 0;
        this.mark = "No mark";
        this.startYear = startYear;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
