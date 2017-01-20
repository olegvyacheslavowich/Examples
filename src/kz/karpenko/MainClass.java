package kz.karpenko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Олег on 19.01.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        Washer washer = new Washer();
        washer.startWashing();
        washer.startWashing();
    }
}

class Washer{
    private Power power = new Power();
    private Drum drum = new Drum();
    private Water water = new Water();

    public void startWashing(){
        power.on();
        drum.isComplete();
        water.openWater(drum);
    }
}

class Power{

    public void on(){
        System.out.println("Washer is work");
    }

    public void off(){
        System.out.println("Washer isn't work");
    }
}

class Drum{
    private boolean complete = false;

    public boolean isComplete(){
        return complete = true;
    }

    public boolean getComplete(){
        return complete;
    }
}

class Water{
    public void openWater(Drum drum){
        if (drum.getComplete()){
            System.out.println("Start washing");
        }
    }
}

