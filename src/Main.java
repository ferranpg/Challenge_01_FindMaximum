import java.util.Arrays;
import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        Integer[] listaInts = {34,0,0};
        IntMax inList;
        inList = new IntMax(listaInts);

        int number;
        NumWord numW = new NumWord();

        out.println("\r\nMaximum: " +  inList.maximum());

        number = 7;
        out.println(numW.printNumberInWord(number));
        number = 0;
        out.println(numW.printNumberInWordCase(number));

        OddEven.checkOddEven(number);

        out.println("\r\n " + Media.average(listaInts));
    }
}
/*-----------------------------------------------------------
Challenge 1: Find Maximum
Write a method maximum that returns the largest integer in the list.
You can assume that the list has at least one element.
-----------------------------------------------------------*/
class IntMax {
    private Integer[] numList;

    public IntMax(Integer[] numList) {
        setNumList(numList);
    }
    public void setNumList(Integer[] numList){
        this.numList = numList;
    }
    public Integer maximum(){
        if (this.numList.length == 0){
            return null;
        } else if (this.numList.length > 1){
            Arrays.sort(this.numList);
            return this.numList[this.numList.length-1];
        } else {
            return this.numList[0];
        }
    }
}

/*-----------------------------------------------------------
Challenge 2: Print number in word
Write a program called printNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER"
if the int variable "number" is 1, 2,... , 9, or other, respectively. Use:
    (a) a "nested-if" statement;
    (b) a "switch-case-default" statement.
-----------------------------------------------------------*/
class NumWord{
    public String printNumberInWord(int num) {
        if (num == 1){
            return "\r\n UNO";
        } else if (num == 2) {
            return "\r\n DOS";
        } else if (num == 3) {
            return "\r\n TRES";
        } else if (num == 4) {
            return "\r\n CUATRO";
        } else if (num == 5) {
            return "\r\n CINCO";
        } else if (num == 6) {
            return "\r\n SEIS";
        } else if (num == 7) {
            return "\r\n SIETE";
        } else if (num == 8) {
            return "\r\n OCHO";
        } else if (num == 9) {
            return "\r\n NUEVE";
        } else {
            return "\r\n OTRO";
        }
    }

    public String printNumberInWordCase(int num) {
        switch (num){
            case 1:
                return "\r\n UNO";
            case 2:
                return "\r\n DOS";
            case 3:
                return "\r\n TRES";
            case 4:
                return "\r\n CUATRO";
            case 5:
                return "\r\n CINCO";
            case 6:
                return "\r\n SEIS";
            case 7:
                return "\r\n SIETE";
            case 8:
                return "\r\n OCHO";
            case 9:
                return "\r\n NUEVE";
            default:
                return "\r\n OTRO";
        }
    }
}

/*-----------------------------------------------------------
Challenge 3: Check Odd/Even
Write a method called checkOddEven which prints "Odd Number"
if the int variable “number” is odd, or “Even Number” otherwise.

Hint n is an even number if (n % 2) is 0; otherwise, it is an odd number.
Use == for comparison, e.g., (n % 2) == 0.
-----------------------------------------------------------*/
class OddEven{
    public static void checkOddEven(int num) {
        if (0 != (num % 2)){
            out.println("\r\n Odd Number");
        }else {
            out.println("\r\n Even Number");
        }
    }
}

/*-----------------------------------------------------------
Challenge 4: Calculate the average
Write a method average that returns the average of the integer in the list.
You can assume that the list has at least one element.
-----------------------------------------------------------*/
class Media{
    public static double average(Integer[] numList) {
        double suma = 0;
        for (Integer integer : numList) {
            suma = suma + integer;
        }
        return suma / numList.length;
    }
}