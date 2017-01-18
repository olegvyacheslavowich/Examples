package kz.karpenko.example;

/**
 * Created by Олег on 18.01.2017.
 */
public class Example {
    private static int number = 0;

    public static synchronized void incNum(){
        number++;
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new SecondClass());
        Thread t2 = new Thread(new SecondClass());
        t1.start();
        t2.start();
        try {
            t1.join(); // ЖДАТЬ МЕНЯ!! Остальные потоки ждут завершения t1!
            t2.join(); // ЖДАТЬ МЕНЯ!! Остальные потоки ждут завершения t2!
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(number);
    }


}
