public class Sequence1 {

    private int firstNumber = 0;
    private int secondNumber = 1;
    private int nextNumber;

    public void displaySequence() {
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        while (nextNumber <= 100) {
            nextNumber = firstNumber + secondNumber;
            System.out.println(nextNumber);

            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

}
