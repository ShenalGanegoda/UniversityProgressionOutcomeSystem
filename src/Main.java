import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in); // Global scanner for reading user inputs.

    public static void main(String[] args) {
        systemChooseInput();
    }

    private static char systemChooseInput(){

        /*
        This section need to be run in a loop till the user inputs a valid input
         */

        boolean correctInput = false;

        System.out.println("******* University of Oxford progression outcome system *******");
        System.out.println();


        // Prompting the user selection of the system.
        System.out.println("University admin - 'U' \nStudent - 'S' ");
        System.out.print("Enter here: ");
        char systemInput = scanner.next().toLowerCase().charAt(0); // Storing the user input in a String variable.

        return systemInput;
    }
}