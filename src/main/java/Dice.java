import java.util.Random;

public class Dice {

    private int numberOfSides;
    private int faceValue;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        rollDice();
    }

    public void rollDice() {
        Random randomNum = new Random();
        int [] weight = {};
        this.faceValue = randomNum.nextInt(numberOfSides) + 1;

    }

    public int getFaceValue() {
        return faceValue;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }
}

