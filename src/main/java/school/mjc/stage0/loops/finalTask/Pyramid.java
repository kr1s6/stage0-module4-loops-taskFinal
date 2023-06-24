package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int spaceLength = cathetusLength-2;
            for (int i = 1; i <= cathetusLength; i++) {
                for(int space=spaceLength; space>=0; space--){
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                    if (j == 1) {
                        for (int k = 2; k <= i; k++) {
                            System.out.print(k);
                        }
                    }
                }
                System.out.println();
                spaceLength--;
            }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
