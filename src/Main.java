import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<>();
        ArrayList<Integer> mirrorSection = new ArrayList<>();
        int offset = 0;
        int mirrorLength = 0;
        System.out.println("enter a number to add to a list");
        userInput.add(input.nextInt());
        while (true) {
            System.out.println("would you like to enter another number? type \"no\" to stop");

            try {
                userInput.add(input.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("calculating mirror size");
                break;
            }
        }
        for (int i = 0; i < userInput.size(); i++) {
            for (int j = i + 1; j < userInput.size(); j++) {
                if (offset == ((userInput.size() / 2))) {
                    break;
                } else if (userInput.get(j).equals(userInput.get(i))) {

                    mirrorSection.add(userInput.get(i));
                    offset = 1;
                    while (true) {
                        if (userInput.get((i + offset)).equals(userInput.get((j - offset)))) {
                            mirrorSection.add(userInput.get(i + offset));
                            offset++;
                        }
                     else{
                        break;
                    }
                }


            }
        } if (offset > mirrorLength) {
            mirrorLength = offset;
        }

    } System.out.println(mirrorLength +mirrorSection.toString());
}  }


