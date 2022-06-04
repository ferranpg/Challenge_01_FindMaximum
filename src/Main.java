
import java.util.Arrays;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        int[] intMax = {2,4,7,0,34};


        if (intMax.length > 1){
            Arrays.sort(intMax);
            out.println("\r\nMaximum: " + intMax[intMax.length-1]);
        } else {
            out.println("\r\nMaximum: " + intMax[0]);
        }



    }
}

