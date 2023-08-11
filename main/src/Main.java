public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder()
                .setBrand("A")
                .setName("A++")
                .setColor("red")
                .setHoursePower(500)
                .setNumberOfDoors(15)
                .build();
    
        Car car2 = new Car.CarBuilder()
                .setBrand("B")
                .setName("B++")
                .setColor("blue")
                .setHoursePower(500)
                .setNumberOfDoors(15)
                .build();
        
        Garge garge = new Garge.GargeBuilder()
                .addCar(car1)
                .addCar(car2)
                .build();
    
        for (Car car:garge.getCars()
             ) {
            System.out.println(car);
        }
        
    }
}