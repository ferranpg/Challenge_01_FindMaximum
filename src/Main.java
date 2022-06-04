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

        number = 6;
        out.println(numW.printNumberInWord(number));
        number = 9;
        out.println(numW.printNumberInWordCase(number));
    }
}
//-----------------------------------------------------------
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

//-----------------------------------------------------------
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
