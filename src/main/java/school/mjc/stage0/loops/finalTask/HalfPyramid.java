package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int spaceLength = cathetusLength-2;
        for (int i = 1; i <= cathetusLength; i++) {
            for(int space=spaceLength; space>=0; space--)
                System.out.print(" ");
            for(int j=1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaceLength--;
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
