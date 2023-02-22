public class App {
    public static void main(String[] args) {
        Thread thread1=new Thread(new CountNumber(10,1000));
        thread1.run();
    }
}
