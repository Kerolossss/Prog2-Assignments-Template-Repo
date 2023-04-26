//kerolos awny william
//202106131

import java.util.*;

public class Main {

    public static void main (String args[]) {
        int X;
        Scanner input = new Scanner(System.in);
        X = input.nextInt();
        for (int i = 1; i <=X ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
