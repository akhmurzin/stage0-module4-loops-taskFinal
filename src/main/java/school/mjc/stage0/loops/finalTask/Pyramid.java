package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            for (int col1 = cathetusLength; col1 > 1; col1--) {
                if (col1 > row) {
                    System.out.print(' ');
                } else {
                    System.out.print(col1);
                }
            }
            for (int col2 = 1; col2 <= row; col2++) {
                System.out.print(col2);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
