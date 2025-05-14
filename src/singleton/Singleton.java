package singleton;

public class Singleton {
    // Volatile keyword ensure visibility across threads.
    private static volatile Singleton instance;

    // Private constructor prevents instantiation.
    private Singleton(){}

    // Double check locking for thread safety and performance.
    public static Singleton getInstance(){
        if(instance == null){ // First check (no locking)
            synchronized (Singleton.class){
                if(instance == null){ // Second check (with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void show(){
        System.out.println("Singleton class is working ...");
    }
} 
