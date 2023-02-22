public class CountNumber implements Runnable{
    private int number;
    private int count;
    CountNumber(int number, int count){
        this.count=count;
        this.number=number;
    }
    @Override
    public void run() {
        for(int i=0;i<count;i++)
            System.out.println(number+i);
    }
}
