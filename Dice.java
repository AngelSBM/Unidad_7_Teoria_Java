
public class Dice {

    private int diceNumber;
    private int diceNumber2;

    public void throwDice() {
        do {
            diceNumber = (int) (Math.random() * 6) + 1;
            diceNumber2 = (int) (Math.random() * 6) + 1;

            System.out.println(diceNumber + " " + diceNumber2);
        } while (diceNumber != diceNumber2);
        System.out.println("IGUALES:" + " " + diceNumber + " = " + diceNumber2);
    }

}
