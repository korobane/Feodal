package ua.miratech.koroban;

/**
 * Created by Elena on 25.11.2018.
 */
public class Dice {

 //   private enum Side {ONE, TWO, THREE, FOUR, FIVE, SIX }
    private DiceSide currentSide;
    public Dice()
    {
        this.currentSide = rollDice();
    }

    public  DiceSide getCurrentSide()
    {
        return currentSide;
    }

    public static  DiceSide rollDice()
    {
     int a = (int) ( Math.random() * 6 );
     return DiceSide.values()[(int) (a)];
    }
}
