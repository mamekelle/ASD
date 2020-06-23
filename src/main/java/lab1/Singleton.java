package lab1;

public class Singleton {

    Runnable runnable = MySingletonLazy::getInstance;

    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        for (int i = 0; i < 5; ++i) {
            singleton.start();
        }
        SingletonEnum.INSTANCE.print();
        System.out.println(MySingletonLazy.count);
    }

    public void start() {
        for (int i = 0; i < 10; ++i) {
            new Thread(runnable).start();
        }
    }

}


