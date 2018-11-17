import java.awt.*;

public class MultiArr {
    public static void main(String[] args) {

/*
        Point[] array = new Point[3];

        array[0] = new Point(1,1);
        array[1] = array[0];
        array[2] = array[1];


        array[0].x = 50;
        array[0].y = 100;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
*/


        /*Point[] array = new Point[3];

        array[0] = new Point(1,1);
        array[1] = array[0];
        array[2] = array[1];


        array[0].x = 50;
        array[0].y = 100;

        array[1].x = 400;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

*/


        // np. szachownica

boolean area[][] = new boolean[3][3];  //tablica 3 na 3
area[0][0] = false; // false nie trzeba podawać
area[1][1] = true; // na tym polu coś stoi
area[2][2] = false;

        System.out.println(area[0][0]);
        System.out.println(area[2][1]);
        System.out.println(area[1][1]);


    }

}
