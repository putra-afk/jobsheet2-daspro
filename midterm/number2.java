package midterm;

public class number2 {
    public static void main(String[] args) {
        double jumlah = 0.0;
        for (double i = 1.0; i <= 99.0; i++) {
            if (i % 2 == 1) {
                jumlah += i;
                System.out.print(i + " + ");
            } else {
                jumlah += i + 1.5;
                System.out.print(i + "1.5 + ");
            }
        }
        System.out.println("\b\b= " + jumlah);
    }
}