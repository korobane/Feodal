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

    public DiceSide rollDice()
    {
     int a = (int) ( Math.random() * 6 );
     currentSide =  DiceSide.values()[(int) (a)];
     return  currentSide;
    }
}
