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
        int rep = 10;
        for (int j = 0; j < rep; j++) {
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
        for (int j = 0; j < rep; j++) {
            for (int i = 0; i < n; i++) {
                yertle.forward(length);
                yertle.right(360/n);
                turnCount++;
            }
            yertle.right(10);
            turnCount++;
        }
        System.out.println("yertle has turned " + turnCount + " times!");

        yertle.up();
        yertle.right(180);
        yertle.forward(100);
        yertle.down();
        // Extension 1: Random
        n = (int)Math.random()*8+5;
        rep = (int)Math.random()*16+5;
        for (int j = 0; j < rep; j++) {
            for (int i = 0; i < n; i++) {
                yertle.forward(length);
                yertle.right(360/n);
            }
            yertle.right(10);
        }

        // Extension 2:
        Turtle mertle = new Turtle(125,125);
        n = (int)Math.random()*8+5;
        int m = (int)Math.random()*80+20;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                mertle.forward(2*i);
                mertle.right(360/n);
            }
            mertle.forward(2*i);
            mertle.right(90);
        }
    }
}
