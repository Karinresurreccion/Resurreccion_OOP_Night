package misplacedact2;

import java.util.Scanner;
public class MisplacedAct2 {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String message = scanner.nextLine();
        Misplaced(message);
    }

    public static void Misplaced(String message) {
        boolean misplaced = false;

        for (int i = 1; i < message.length(); i++) {
            char c = message.charAt(i);
            char pChar = message.charAt(i - 1);

            if (Character.isUpperCase(c) && !Character.isWhitespace(pChar)) {
                misplaced = true;break;
            }
        }
        System.out.println(misplaced ? "JEJE!" : "uWu");
    }
}


 