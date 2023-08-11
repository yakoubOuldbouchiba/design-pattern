package src;

public class SingletonPatternLazy {
    //early or eager instantiation
    private static volatile SingletonPatternLazy singletonPattern = null;
    
    private SingletonPatternLazy() {
    
    }
    
    public static SingletonPatternLazy getInstance() {
        //to make to sure it is thread safe
        synchronized (SingletonPatternLazy.class) {
            if (singletonPattern == null) {
                singletonPattern = new SingletonPatternLazy();
            }
        }
        return singletonPattern;
    }
    
    public void show() {
        System.out.println("This is the show() method of the SingletonPattern ...");
    }
}
