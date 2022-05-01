class Counter {
    private int MAX_COUNT = 50;
    private int step = 2;
    private int count = 1;

    public void displayCount() {
        while (count < MAX_COUNT) {
            System.out.println(count);
            count += step;

        }
    }
}