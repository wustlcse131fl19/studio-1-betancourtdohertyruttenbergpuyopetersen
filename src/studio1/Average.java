package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Please enter the first number.");
        int n2 = ap.nextInt("Please enter the second number.");
        int n3 = n1 + n2;
        double n4 = n3 / 2.0;
        System.out.print(n4);

    }
}
