class Singleton {
    // Volatile variable ensures that multiple threads handle the instance variable correctly.
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation from other classes.
    private Singleton() {
        // Prevent reflection from destroying the singleton pattern
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create.");
        }
    }

    // Method to return the instance of the class.
    public static Singleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (Singleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Example method to demonstrate singleton usage
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

class Main {
    public static void main(String[] args) {
        // Runnable task to be executed by multiple threads
        Runnable task = () -> {
            Singleton singleton = Singleton.getInstance();
            singleton.showMessage();
        };

        // Creating multiple threads to test Singleton behavior in a multithreaded environment
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
