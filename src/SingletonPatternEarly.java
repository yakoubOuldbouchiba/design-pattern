package src;

public class SingletonPatternEarly {
    //early or eager instantiation
    private static volatile SingletonPatternEarly singletonPattern = new SingletonPatternEarly();
    
    private SingletonPatternEarly(){
    
    }
    
    public static SingletonPatternEarly getInstance(){
        return singletonPattern;
    }
    
    public void show(){
        System.out.println("This is the show() method of the SingletonPattern ...");
    }
}
