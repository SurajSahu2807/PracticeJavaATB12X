package ex_02_Java_Basics_Part2;

public class Lab027_FinalVariableExample {
    public static void main(String[] args) {
        final byte a = 127; // -128 to 127
        final short b = 128; // 2 bytes
        final char c = 'A'; // 2 bytes
        final int d = 7; // 4 bytes
        final long e = 93963634556L; // 8 bytes
        final long e1 = 99632665666l;

        double f = 9933633.56666; // 8 bytes
        float g = 99333.266f; // 4 bytes
        float g1 = 9966.22343F;
//        e1 = e1 + 1; // cannot assign a value into a final variable

    }
}
