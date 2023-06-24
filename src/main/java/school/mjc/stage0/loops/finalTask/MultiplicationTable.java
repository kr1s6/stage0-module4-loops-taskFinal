package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        if(numberTableToPrint >= 0)
        {
            for(int i=1; i <= 10; i++){
                System.out.println(i + " x " + numberTableToPrint + " = " + numberTableToPrint*i);
            }
        }
        else
            System.out.println("Number should be positive integer");
    }
}
