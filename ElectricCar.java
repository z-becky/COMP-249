package Vehicle;

public class ElectricCar extends Car{
    protected int maxAutonomyKilometers;
    private int plateNumberNumber = 1000;
    private final String PLATE_NUMBER_TYPE = "EC";

    //default constructor
    public ElectricCar(){
        maxAutonomyKilometers = 0;
        plateNumberNumber++;
        plateNumber = PLATE_NUMBER_TYPE + plateNumberNumber;
    }

    //parameterized constructor
    public ElectricCar(String make, String model, int yearOfProduction, int maxPassengers, int maxAutonomyRangeKilometers){
        super(make,model,yearOfProduction, maxPassengers);
        this.maxAutonomyKilometers = maxAutonomyRangeKilometers;
        plateNumberNumber++;
        plateNumber = PLATE_NUMBER_TYPE + plateNumberNumber;
    }

    //copy constructor
    public ElectricCar(ElectricCar other){
        super(other);
        maxAutonomyKilometers = other.maxAutonomyKilometers;
        plateNumberNumber++;
        plateNumber = PLATE_NUMBER_TYPE + plateNumberNumber;
    }

    //getters
    public int getMaxAutonomyKilometers(){
        return maxAutonomyKilometers;
    }

    //setters
    public void setMaxAutonomyKilometers(int newMaxAutonomyKilometers){
        maxAutonomyKilometers = newMaxAutonomyKilometers;
    }

    //toString method
    @Override
    public String toString(){
        return super.toString() + "\nMaximum Autonomy Range: " + maxAutonomyKilometers;
    }

    //equals method
    public boolean equals(ElectricCar other){
        return super.equals(other) && maxAutonomyKilometers == other.maxAutonomyKilometers;
    }

}
