import java.awt.*;

public class Arrays {
    public static void main(String[] args) {

        String[] requests;
        Point[] points;

        int[] temps = new int[99];
        temps[0] = 6;
        temps[1] = 90;

        System.out.print(temps[66]); // nie podaliśmy pozycji 66 więc wyświetla wartość 0

//        temps[123] = 78;  --> zadeklarowane jest tylko 99 miejsc a chcemy wywołać pozycję 123

        System.out.println();

        int[] i = {1,2,3}; // ta tablica ma 3 elementy
        Point[] markup = {new Point(1,2), new Point(1,5), new Point(4,3)}; // ta tablica ma 3 elementy bo tyle ih podaliśmy
        String[] titles = {"Pan", "Pani", "Państwo"}; // ta tablica ma 3 elementy

        System.out.println(titles.length);



    }

}
