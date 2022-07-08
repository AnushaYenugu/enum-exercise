package lexicon.fundamentals.oop;

import java.util.Random;

public enum Dice {
    D6(6),D10(10),D20(20),D100(100);

    public int maxValue;
    public static final int minValue=1;
    Random random=new Random();

    private Dice(int maxvalue){
        this.maxValue=maxvalue;
    }

    public int getMaxValue(){
        return maxValue;
    }

    public void rollDice(){
        System.out.println("The rolled value: "+ (random.nextInt(maxValue)+minValue));
    }

}
