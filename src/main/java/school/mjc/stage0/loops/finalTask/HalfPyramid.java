package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            for (int col = cathetusLength; col >= 1; col--) {
                if (col > row) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
