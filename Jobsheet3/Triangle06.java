package Jobsheet3;

import java.util.Scanner;

public class Triangle06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int base, height;
        float area;
        System.out.print("Input base: ");
        base=sc.nextInt();
        System.out.print("Input height: ");
        height = sc.nextInt();
        area = base * height / 2;
        System.out.println("Area of the triangle: " + area);
    }
}