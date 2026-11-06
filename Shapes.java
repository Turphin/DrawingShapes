public class Shapes {
    public static void main(String[] args) {
        Turtle yertle = new Turtle();

        // Task 1: Draw a regular shape
        int n = 5;
        int length = 50;
        for (int i = 0; i < n; i++) {
            yertle.forward(length);
            yertle.right(360/n);
        }

        yertle.up();
        yertle.right(180);
        yertle.forward(100);
        yertle.down();
        // Task 2: Draw a regular shape many times
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < n; i++) {
                yertle.forward(length);
                yertle.right(360/n);
            }
            yertle.right(10);
        }

        yertle.up();
        yertle.right(180);
        yertle.forward(100);
        yertle.down();
        // Task 3: How many times does Turtle turn!
        int turnCount = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < n; i++) {
                yertle.forward(length);
                yertle.right(360/n);
                turnCount++;
            }
            yertle.right(10);
            turnCount++;
        }
        System.out.println("yertle has turned " + turnCount + " times!");

        
        // Extension 1:


        // Extension 2:

    }
}
