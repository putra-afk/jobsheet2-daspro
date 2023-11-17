package midterm;

import java.util.Scanner;

public class number3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat N: ");
        int n = input.nextInt();

        int count = 0; 

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                count++;
            }
            n /= 10;
        }

        System.out.println("Jumlah digit genap dari bilangan N adalah " + count);
    }
}