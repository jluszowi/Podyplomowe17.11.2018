import javax.lang.model.element.NestingKind;

public class IfAndSwitch {
    public static void main(String[] args) {

        /*

        if (args.length < 3) {             //jeżeli długość naszej tablicy jest mniejsza od 3
            System.out.println("Zbyt mało argumentów");
            System.exit(-1);
        // nie przekazaliśmy żadnych argumentów
// należy używać klamer aby używać

            */

        String server;

        if (args.length < 1) {          // jeżeli nie podamy żadnych argumentów, czyli mieij niż 1
            server = "localhost";
        } else {
            server = args[0];
        }
        System.out.println(server);


/*

        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'C':
                System.out.println("Mogło być lepiej");
                break;

                default:
                    System.out.println("Rozważ oszukiwanie");
        }

*/
        char grade = 'D';

        if (grade == 'A') {

            System.out.println("Wspaniale!");
        } else if (grade == 'B') {
            System.out.println("Dobrze");
        } else if (grade == 'C') {
            System.out.println("Mogło byc lepiej");
        } else {
            System.out.println("Rozważ oszukiwanie");

        }



        int myScore = 5;
        int yourScore = 7;
        int bestScore;

        bestScore = myScore > yourScore ? myScore : yourScore;
        System.out.println(bestScore);









    }
}