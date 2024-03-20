package abstractFactory;

interface Vehicle {
    void displayInfo();
}

class Car implements Vehicle {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car brand: " + brand);
    }
}

class Motorcycle implements Vehicle {
    private String brand;

    public Motorcycle(String brand) {
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle brand: " + brand);
    }
}

interface VehicleFactory {
    Vehicle createVehicle(String brand);
}

class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String brand) {
        return new Car(brand);
    }
}

class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String brand) {
        return new Motorcycle(brand);
    }
}

