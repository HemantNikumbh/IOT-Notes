class Singletone{
    private static volatile Singletone instance;

    private Singletone(){
        if(instance!= null){
            throw new RuntimeException("use getinstance");
        }

    }

    public static Singletone getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance = new Singletone();
                }
            }
        }
        return instance;
    }

    public void showmessage(){
        System.out.println("hello hemant how are you");
    }

}


public class Main1 {
    public static void main(String args[]){
        Runnable task= ()->{
            Singleton singletone = Singleton.getInstance();
            singletone.showMessage();
        }; 
        Thread t1= new Thread(task);
        Thread t2 = new Thread(task);
        
        t1.start();
        t2.start();
    }
    
}
