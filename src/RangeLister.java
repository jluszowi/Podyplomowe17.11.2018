public class RangeLister {

    private String name;

    public static void main(String[] args) {
        RangeLister rangeLister = new RangeLister();
        int[] range;
        range = rangeLister.makeRange(4,13);            // wywołaliśmy metodę, została zwrócona warość
        rangeLister.show(range);                                                     //   zwraca tablicę intów
    }

    int[] makeRange (int lower, int upper) {            //metoda w klasie, nie statyczna
        int [] range = new  int[(upper-lower)+1];

        for (int i=1; i<range.length; i++) {
            range [i] = lower++;
        }
        return range;
    }

    void show(int[] range) {
        System.out.print("Tablica: [");
        for(int i=1; i<range.length; i++){
            System.out.print(range[i] + " ");
        }
        System.out.print("]");
    }

    void setName(String name) {
        this.name = name;

    }
}
