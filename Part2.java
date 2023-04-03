package workshop2;

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {

        boolean cont = false;
        do {
            try {
                String s = "";
                String pattern = "SE[0-9]{3}"; // pattern which expects the first 2 character to be SE followed by 3 digits
                Scanner sc = new Scanner(System.in); // create an object of Scanner to input data from keyboard
                System.out.println("enter the string:");
                s = sc.nextLine(); // read the entire line of input
                if (!s.matches(pattern)) {
                    throw new Exception();
                }
                System.out.println("The string is " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                cont = true;
            }
        } while (cont);

    }

}
