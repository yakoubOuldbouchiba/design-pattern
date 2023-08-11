public class Car {
    
    private String brand;
    private String name;
    private String color;
    private int numberOfDoors;
    private int hoursePower;
    
    public static class CarBuilder{
        private String brand;
        private String name;
        private String color;
        private int numberOfDoors;
        private int hoursePower;
    
        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }
    
        public CarBuilder setName(String name) {
            this.name = name;
            return this;
        }
    
        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }
    
        public CarBuilder setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }
    
        public CarBuilder setHoursePower(int hoursePower) {
            this.hoursePower = hoursePower;
            return this;
        }
        
        public Car build(){
            Car car = new Car();
            car.name= this.name;
            car.brand=this.brand;
            car.color=this.color;
            car.numberOfDoors=this.numberOfDoors;
            car.hoursePower=this.hoursePower;
            return car;
        }
    }
    
    public Car() {
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getName() {
        return name;
    }
    
    public String getColor() {
        return color;
    }
    
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    
    public int getHoursePower() {
        return hoursePower;
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", hoursePower=" + hoursePower +
                '}';
    }
}
