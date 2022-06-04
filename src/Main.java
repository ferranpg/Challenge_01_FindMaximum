import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        Integer[] listaInts = {34,0,0};
        IntMax inList;
        inList = new IntMax(listaInts);

        out.println("\r\nMaximum: " +  inList.maximum());
    }
}

