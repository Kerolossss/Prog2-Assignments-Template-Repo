//kerolos awny william
//202106131

import java.util.*;

public class Main {

    public static void main (String args[]) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        for (int i = 1; i <= 12; ++i) {
            System.out.println(x + " * " + i +
                    " = " + x * i);
        }
    }

    }
