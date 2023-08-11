import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    
        ArrayList<String> friends = new ArrayList<>();
        friends.add("t1");
        friends.add("t2");
        Person person = new Person("t3" , 25 , friends);
    
        System.out.println(person.getName()+"-"+person.getAge()+"-"+person.getFriends() );
        person.getFriends().clear();
        System.out.println(person.getName()+"-"+person.getAge()+"-"+person.getFriends() );
        
        
    }
}