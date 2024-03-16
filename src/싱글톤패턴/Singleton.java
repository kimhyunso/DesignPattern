public class Singleton{
    // 기존
    // private static Singleton uniqueInsternce;
    // 멀티스레딩 문제 해결 방법 2
    // private static Singleton uniqueInstance = new Singleton();
    // 멀티스레딩 문제 해결 방법 3
    private volatile static Singleton uniqueInstance;

    private Singleton(){

    }
    // 기존
    // public static Singleton getInstance(){
    //     if (uniqueInstance == null){
    //         uniqueInstance = new Singleton();
    //     }
    //     return uniqueInstance;
    // }
    // 멀티스레딩 문제 해결 방법 2
    // public static Singleton getInstance(){
    //     return uniqueInstance;
    // }

    // 멀티스레딩 문제 해결 방법 3
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }    

}