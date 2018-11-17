public class Blocks {
    public static void main(String[] args) {

        int x = 5;

//        {
            int y = 10;
            y = y + x;

            System.out.println("y = " + y);

//        }

        System.out.println("x = " + x);
        System.out.println("y = " + y); //nie można powołać się na y ponieważ jest on zadeklarowany
                                        // w bloku i tylko w tym bloku jest widoczny




    }

}
