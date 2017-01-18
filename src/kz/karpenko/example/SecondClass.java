package kz.karpenko.example;

/**
 * Created by Олег on 18.01.2017.
 */
public class SecondClass implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++)
            Example.incNum();
    }
}
