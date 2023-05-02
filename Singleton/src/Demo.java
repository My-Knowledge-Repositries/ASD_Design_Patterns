public class Demo {
    public static void main(String[] args) {
        Singleton singleton1 = new Singleton();
        Singleton singleton2 = new Singleton();
        System.out.println(singleton1==singleton2);
    }
}
