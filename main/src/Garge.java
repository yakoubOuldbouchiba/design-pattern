import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garge {
    
    private List<Car>  cars;
    
    public static class GargeBuilder{
    
        private List<Car>  cars = new ArrayList<>();
        
        public GargeBuilder addCar(Car car){
            cars.add(car);
            return this;
        }
        
        public Garge build(){
          Garge garge=  new Garge();
          garge.cars = this.cars;
          return garge;
        }
    
    }
    
    
    public Garge() {
    }
    
    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
