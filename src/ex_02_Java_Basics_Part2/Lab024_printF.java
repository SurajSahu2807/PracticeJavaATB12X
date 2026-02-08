package ex_02_Java_Basics_Part2;

public class Lab024_printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.printf("Your Variable is %d",a);
        // %d --> byte, short, int, long
        // %f --> float, double
        // %s --> String
        // %b --> boolean
        System.out.print(a);
        System.out.println();

        int b = 20;
        System.out.printf("%d + %d",a,b);
    }
}
