package Jobsheet3;

import java.util.Scanner;

public class Bank06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int init_sav_amount, sav_period;
        double final_sav_mount, interest, interest_percent = 0.02;
        System.out.print("Input your initial savings amount: ");
        init_sav_amount = sc.nextInt();
        System.out.print("Input your Savings period: ");
        sav_period = sc.nextInt();
        interest = sav_period * interest_percent * init_sav_amount;
        final_sav_mount = interest + init_sav_amount;
        System.out.println("Interest: " + interest);
        System.out.println("Final savings amount: " + final_sav_mount);
    }
}
