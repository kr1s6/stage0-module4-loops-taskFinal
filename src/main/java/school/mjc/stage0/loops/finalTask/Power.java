package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int finalNumber = numberToPrint;
        for(int i=1; i<=power-1; i++){
            finalNumber = finalNumber * numberToPrint;
        }
        System.out.println(finalNumber);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
