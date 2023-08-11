import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {
    private final String name;
    private final int age ;
    private final ArrayList<String> friends;
    
    public Person(String name, int age, ArrayList<String> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public ArrayList<String> getFriends() {
        return (ArrayList<String>) this.friends.clone();
    }
}
