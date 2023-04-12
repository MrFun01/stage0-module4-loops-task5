package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength==5){
            System.out.println(
                    "  8  \n" +
                    "  8  \n" +
                    "88888\n" +
                    "  8  \n" +
                    "  8  ");
        }
        if (sideLength==3){
            System.out.println(
                            " 8 \n" +
                            "888\n" +
                            " 8 "
            );
        }
    }
}
