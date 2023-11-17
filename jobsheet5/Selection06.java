package jobsheet5;

import java.util.Scanner;

public class Selection06 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        input06.close();
        System.out.println("Inpet a number= ");
        int number = input06.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is am even number!");
        } else {
            System.out.println(number + " is an odd number!");
        }
    }
}
