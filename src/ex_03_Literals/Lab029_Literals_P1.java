package ex_03_Literals;

public class Lab029_Literals_P1 {
    public static void main(String[] args) {
        int a = 10;
        // Literal type --> integral

        final float pi = 3.14f;
        // Literal type --> float

        final Boolean n1 = true;
        // Literal type --> Boolean

        char ch = 'A';
        char ch1 = '@';
        // Literal type --> character

        // Escape Char
        char new_line = '\n';
        char Tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r'; // carriage return delete's one or two words  in return

        System.out.println("Suraj"+ new_line + "Sahu");
        System.out.println("Suraj" + Tab_line + "Sahu");
        System.out.println("Suraj" + back_space + "Sahu");
        System.out.println("Suraj is a " + carriage_return + "Good Boy"); // this delete a "Suraj is a" completely

        System.out.println("-------------------");
        System.out.println("Suraj \n Sahu");
        System.out.println("Suraj \t Sahu");
        System.out.println("Suraj \b Sahu");


        char c10 = 'A'; // ASCII value --> 65
        char c11 = 'Z'; // ASCII value --> 90
        char c12 = 'a'; // ASCII value --> 97
        char c13 = 'z'; // ASCII value --> 122
        System.out.println( (int) c12);
        System.out.println( (int) c13);






    }
}
