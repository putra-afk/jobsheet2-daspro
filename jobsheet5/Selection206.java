package jobsheet5;

import java.util.Scanner;

public class Selection206 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        input06.close();
        System.out.println("Nilai uas   : ");
        float finalExam = input06.nextFloat();
        System.out.println("Nilai uts   : ");
        float midExam = input06.nextFloat();
        System.out.println("Nilai kuis  : ");
        float quiz = input06.nextFloat();
        System.out.println("Nilai tugas : ");
        float assignment = input06.nextFloat();

        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assignment * 0.2F);
        // String message = total < 65 ? "Retake" : "Pass";
        // System.out.println("Final Grade = " + total + " and decission is " +
        // message);

    }
}
