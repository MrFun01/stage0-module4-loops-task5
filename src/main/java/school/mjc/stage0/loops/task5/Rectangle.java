package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        int i, j;
        for (i = 1; i <= height; i++) {
            for (j = 1; j <= length; j++) {
                if (i == 1 || j == 1 || i == height || j == length)
                    System.out.print("8");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
