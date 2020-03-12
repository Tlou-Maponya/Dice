public class MainProgram {
    public static void main(String[] args) {
        Dice die = new Dice(6);

        System.out.println(die.getNumberOfSides() + " sided die: \n{");
        for (int i = 0; i < 10; i++) {
            System.out.println("\tRoll " + (i+1) + ": " + die.getFaceValue());
            die.rollDice();
        }
        System.out.println("}");
    }
}
