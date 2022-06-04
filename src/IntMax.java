import java.util.Arrays;

public class IntMax {
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
